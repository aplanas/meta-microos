SUMMARY = "Devel files for the fish shell"
DESCRIPTION = "This package contains development files for the fish shell."
LICENSE = "GPL-2.0-only"

PV = "3.6.1"

RPM_NAME = "fish-devel-3.6.1-1.2.aarch64.rpm"
RPM_HASH = "835b406dd7251a9f3402d31b97d7548c0f80d24c913ce1fb9fa985d9e91e751d51468ca398c7f347693e74cb0a7f54e0793e451b84a9b44d182caebb645e04a8"

RPROVIDES:${PN} += "fish-devel \
pkgconfig-fish"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
