SUMMARY = "Coturn development headers"
DESCRIPTION = "This package contains the TURN development headers."
LICENSE = "BSD-3-Clause"

PV = "4.6.2"

RPM_NAME = "coturn-devel-4.6.2-1.1.aarch64.rpm"
RPM_HASH = "fe4712f8012d824661fd1decf68b10c4134e7481959a0d3a5d4948b2ee855fb03116016f3666a0246bc6b38508307481d7bca9b6e978cec551307dd2926a5540"

RPROVIDES:${PN} += "coturn-devel \
coturn-devel(aarch-64)"
RDEPENDS:${PN} += "coturn"

inherit rpm
