SUMMARY = "Development files for py3c"
DESCRIPTION = "py3c helps porting C extensions to Python 3."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "py3c-devel-1.4-1.2.noarch.rpm"
RPM_HASH = "7d96d923cac767944f022c4c0c7404e42282aea4c7aa0c50898b50b238e889548c319abf2370dcb33f3f2236c65fbf88a089ba21be4130a25eb01650ea648572"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig(py3c) \
py3c-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
