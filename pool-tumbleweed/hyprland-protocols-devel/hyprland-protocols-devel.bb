SUMMARY = "Development files for Hyprland protocols"
DESCRIPTION = "Wayland protocol extensions for interacting or modifying Hyprland."
LICENSE = "MIT"

PV = "0.2"

RPM_NAME = "hyprland-protocols-devel-0.2-3.1.noarch.rpm"
RPM_HASH = "ec24cdcfd1f8c418a9dbb4191edf1df6658ab507f4393d33ee21b6f8ffee775cd83c7273c741766bc9bb940c9418c2ad1fb8bed3968c511884d79f6c7d687bc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hyprland-protocols-devel \
pkgconfig-hyprland-protocols"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
