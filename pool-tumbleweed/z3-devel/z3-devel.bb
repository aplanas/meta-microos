SUMMARY = "Development files for Z3"
DESCRIPTION = "Development files for the Z3 library."
LICENSE = "MIT"

PV = "4.12.1"

RPM_NAME = "z3-devel-4.12.1-1.3.aarch64.rpm"
RPM_HASH = "5ffb10056f5eafa253827867eae2c7383c47c652e62584da3ab1001b7bab30d7b6ff355597cc71cc27a1743f10b475b15c32cf5ce570243ff602263ded9e894c"

RPROVIDES:${PN} += "cmake(Z3) \
pkgconfig(z3) \
z3-devel \
z3-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libz3-4_12"

inherit rpm
