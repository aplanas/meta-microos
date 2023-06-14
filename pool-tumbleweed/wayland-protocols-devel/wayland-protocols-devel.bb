SUMMARY = "Wayland protocols that add functionality not available in the core protocol"
DESCRIPTION = "This package contains Wayland protocols that add functionality not \
available in the Wayland core protocol. Such protocols either add \
completely new functionality, or extend the functionality of some other \
protocol either in Wayland core, or some other protocol in \
wayland-protocols."
LICENSE = "MIT"

PV = "1.31"

RPM_NAME = "wayland-protocols-devel-1.31-1.2.noarch.rpm"
RPM_HASH = "1e6a2d86319c15ad6ea5956d1f0ddab347512b4797dded76ad0217b045a526e0dea38265c91e7c4674cc9cf89fa35e198fe3c7ef68a0d3fbc523c2e0244fac29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig-wayland-protocols \
wayland-protocols-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
