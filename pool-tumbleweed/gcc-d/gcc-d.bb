SUMMARY = "The system GNU D Compiler"
DESCRIPTION = "The system GNU D Compiler."
LICENSE = "GPL-3.0-or-later"

PV = "13"

RPM_NAME = "gcc-d-13-1.3.aarch64.rpm"
RPM_HASH = "39d66d2f4640066d12cfcaebba8f6a32f0d4e44af4cffa6e4bbe6e512da11066892d253ea87fe60a541814263e02e8411767b1e14113ab4efb72a84e886d3be1"

RPROVIDES:${PN} += "gcc-d \
gcc-d(aarch-64)"

RDEPENDS:${PN} += "gcc \
gcc13-d \
update-alternatives"

inherit rpm
