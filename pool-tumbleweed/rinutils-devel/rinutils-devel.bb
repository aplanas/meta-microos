SUMMARY = "Shlomi Fish's gnu11 C Library of Random headers"
DESCRIPTION = "Shlomi Fish's gnu11 C Library of Random headers."
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "rinutils-devel-0.10.1-1.4.noarch.rpm"
RPM_HASH = "72eb6f0b8bdd4fed8591bbb77830950da04e35fd9d519c1c87b7c9499d99027875d292c8caae1cadcbc86a9833a6e29cfc6a23c10b66ff9b93721f7d187436dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake-Rinutils \
pkgconfig-librinutils \
rinutils-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
