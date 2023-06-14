SUMMARY = "Development files for Hyprland protocols"
DESCRIPTION = "Wayland protocol extensions for interacting or modifying Hyprland."
LICENSE = "MIT"

PV = "0.2"

RPM_NAME = "hyprland-protocols-devel-0.2-2.1.noarch.rpm"
RPM_HASH = "bf90bca20725225e38df2cf5a844cac43679472212783806c28e9761da30e4e1e08f6dc52b835b71f2490d448cf71791728acc3249acd0cafa82e178c3823fe6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hyprland-protocols-devel \
pkgconfig-hyprland-protocols"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
