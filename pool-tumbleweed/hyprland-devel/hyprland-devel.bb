SUMMARY = "Files required to build Hyprland plugins"
DESCRIPTION = "This package contains the neccessary files that are required to \
build plugins for hyprland."
LICENSE = "BSD-3-Clause"

PV = "0.27.2"

RPM_NAME = "hyprland-devel-0.27.2-1.1.aarch64.rpm"
RPM_HASH = "6af2287a08c33efd394136077aa33bb5ac5925e447de73acb95b65412f48059f6d75353ee80be0ad0aab083fe88f7acec190b01491c0321c8e77b1351fdd1911"

RPROVIDES:${PN} += "hyprland-devel \
pkgconfig-hyprland"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
hyprland"

inherit rpm
