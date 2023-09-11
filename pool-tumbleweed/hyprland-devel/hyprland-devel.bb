SUMMARY = "Files required to build Hyprland plugins"
DESCRIPTION = "This package contains the neccessary files that are required to \
build plugins for hyprland."
LICENSE = "BSD-3-Clause"

PV = "0.29.1"

RPM_NAME = "hyprland-devel-0.29.1-1.1.aarch64.rpm"
RPM_HASH = "2181b6332d3b237bb5ca5d4eb42ff3cfc7aa9551ce1249dee148f009669fbb203ca790944365610fb8ad451b6eadfb0202fbf8b667a96fdcc5258c895223de8b"

RPROVIDES:${PN} += "hyprland-devel \
pkgconfig-hyprland"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
hyprland"

inherit rpm
