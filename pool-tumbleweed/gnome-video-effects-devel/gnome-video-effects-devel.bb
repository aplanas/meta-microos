SUMMARY = "Collection of GStreamer effects -- Development Files"
DESCRIPTION = "A collection of GStreamer effects to be used in different GNOME Modules."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.0"

RPM_NAME = "gnome-video-effects-devel-0.6.0-1.1.noarch.rpm"
RPM_HASH = "6dc1b3a6dadfb32d023c962a2748f339abc09aa4ca09b8f91a49c17c8083ea8a4d450103fe7967b52dbf099a477f431ee06b78a6fab96cab4a7880d0701f3c06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-video-effects-devel \
pkgconfig-gnome-video-effects"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnome-video-effects"

inherit rpm
