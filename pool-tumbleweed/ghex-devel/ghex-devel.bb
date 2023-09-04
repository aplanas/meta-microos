SUMMARY = "GNOME Binary Editor -- Development Files"
DESCRIPTION = "GHex allows the user to load data from any file and to view and edit it \
in either hex or ASCII. It is a must for anyone playing games that use \
a non-ASCII format for saving."
LICENSE = "GPL-2.0-or-later"

PV = "44.2"

RPM_NAME = "ghex-devel-44.2-1.1.aarch64.rpm"
RPM_HASH = "8e2d2f243827656f2b26b499ba2e8cadfddb03b06779f68014c4ee6e3a8703394867b9cec18d7e5f98ca59431f604608a14cb98ea4a96e6b1b3f214f9292ed94"

RPROVIDES:${PN} += "ghex-devel \
pkgconfig-gtkhex-4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgtkhex-4-1 \
pkgconfig-gtk4"

inherit rpm
