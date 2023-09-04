SUMMARY = "Files required to build Hyprland plugins"
DESCRIPTION = "This package contains the neccessary files that are required to \
build plugins for hyprland."
LICENSE = "BSD-3-Clause"

PV = "0.28.0"

RPM_NAME = "hyprland-devel-0.28.0-1.1.aarch64.rpm"
RPM_HASH = "610acf25f9117043f1d0325b0034309583f69614792a15cf2e2bbbd674342a03234cd63d52bb9aa97f81b0a755cfbab0b93fb870c5bf494c4e328098d75306a0"

RPROVIDES:${PN} += "hyprland-devel \
pkgconfig-hyprland"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
hyprland"

inherit rpm
