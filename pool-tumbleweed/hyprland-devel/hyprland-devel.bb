SUMMARY = "Files required to build Hyprland plugins"
DESCRIPTION = "This package contains the neccessary files that are required to \
build plugins for hyprland."
LICENSE = "BSD-3-Clause"

PV = "0.26.0"

RPM_NAME = "hyprland-devel-0.26.0-1.2.aarch64.rpm"
RPM_HASH = "98c69853499b113455757cecb369ff9f17601f6b0579a07491a0d57e93209b8841fec1bf15a8e4e987e5aed71362326c7559882fcfb115e7a6eb43d7bbcbd4ed"

RPROVIDES:${PN} += "hyprland-devel \
pkgconfig-hyprland"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
hyprland"

inherit rpm
