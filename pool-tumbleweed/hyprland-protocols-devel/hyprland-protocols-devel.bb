SUMMARY = "Development files for Hyprland protocols"
DESCRIPTION = "Wayland protocol extensions for interacting or modifying Hyprland."
LICENSE = "MIT"

PV = "0.2"

RPM_NAME = "hyprland-protocols-devel-0.2-5.1.noarch.rpm"
RPM_HASH = "a72f0f62b581ad79161c1090a20d4dc4ea83484dcf9cbfb4e45308319d7dffc78cbf11557723452bd3e320891b7364240a618022ad9548aaa10c48c2491c4e38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hyprland-protocols-devel \
pkgconfig-hyprland-protocols"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
