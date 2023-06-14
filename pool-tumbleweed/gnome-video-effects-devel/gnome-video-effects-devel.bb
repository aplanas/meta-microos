SUMMARY = "Collection of GStreamer effects -- Development Files"
DESCRIPTION = "A collection of GStreamer effects to be used in different GNOME Modules."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "gnome-video-effects-devel-0.5.0-3.6.noarch.rpm"
RPM_HASH = "d320a27385e942df280df4d0cd0041571072b552e8ee386952e39c544e451629ada0d56f584445f2f491c8656e642482896a3669a536ccc44cc3ce5602165bc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-video-effects-devel \
pkgconfig-gnome-video-effects"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnome-video-effects"

inherit rpm
