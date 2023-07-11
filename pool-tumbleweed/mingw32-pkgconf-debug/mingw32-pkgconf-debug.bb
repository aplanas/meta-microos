SUMMARY = "Debug information for package mingw32-pkgconf"
DESCRIPTION = "This package provides debug information for package mingw32-pkgconf. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "ISC"

PV = "1.6.3"

RPM_NAME = "mingw32-pkgconf-debug-1.6.3-5.3.noarch.rpm"
RPM_HASH = "54827dcdebd06108178cfb15c8995bb67e621480c9947be35d48ee7cdedc19cbef0ac73480aee3a030e8c3eed96937f5af832b980cb4dc30654f0170e6f00dea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-pkgconf-debug"

RDEPENDS:${PN} += ""

inherit rpm
