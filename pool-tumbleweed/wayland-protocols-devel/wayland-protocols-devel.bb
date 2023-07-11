SUMMARY = "Wayland protocols that add functionality not available in the core protocol"
DESCRIPTION = "This package contains Wayland protocols that add functionality not \
available in the Wayland core protocol. Such protocols either add \
completely new functionality, or extend the functionality of some other \
protocol either in Wayland core, or some other protocol in \
wayland-protocols."
LICENSE = "MIT"

PV = "1.32"

RPM_NAME = "wayland-protocols-devel-1.32-1.1.noarch.rpm"
RPM_HASH = "ad744c75c153a94783a3116e6fb2aded20df56df90300daf1223afe740a3f206470808889e2220818480bbc21d17ef4fb258026d495434c493bf4b041e104693"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig-wayland-protocols \
wayland-protocols-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
