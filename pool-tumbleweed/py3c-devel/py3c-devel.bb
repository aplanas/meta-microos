SUMMARY = "Development files for py3c"
DESCRIPTION = "py3c helps porting C extensions to Python 3."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "py3c-devel-1.4-1.4.noarch.rpm"
RPM_HASH = "83002f2ac29ffee007f1775d164f08ee8f7c57b78df5374357510aaf499c4787ff206355df40245ba17f79419cf7566edd53efcf25bdcd69fc22572f91a294c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig-py3c \
py3c-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
