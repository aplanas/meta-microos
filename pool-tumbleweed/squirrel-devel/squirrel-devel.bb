SUMMARY = "Development files for squirrel"
DESCRIPTION = "This package contains everything to embed the Squirrel engine in \
your own application."
LICENSE = "MIT"

PV = "3.2"

RPM_NAME = "squirrel-devel-3.2-2.2.aarch64.rpm"
RPM_HASH = "0c107b162ae3847ccf22e08f1809b1ee39078e22f425d66a6d646813de24f3b8c22d4d7001205d1c6efb2193a98e035f44be8ab43c4c4b552c155dbada8b4343"

RPROVIDES:${PN} += "cmake(squirrel) \
squirrel-devel \
squirrel-devel(aarch-64)"

RDEPENDS:${PN} += "libsquirrel1001"

inherit rpm
