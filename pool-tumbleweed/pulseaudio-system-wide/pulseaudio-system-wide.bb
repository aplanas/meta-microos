SUMMARY = "Support for running PulseAudio daemon system wide"
DESCRIPTION = "PulseAudio daemon can be run as a system-wide instance which than can be shared \
by multiple local users. We recommend running the PulseAudio daemon per-user, \
just like the traditional ESD sound daemon. In some situations however, such as \
embedded systems where no real notion of a user exists, it makes sense to use \
the system-wide mode. \
 \
Before you now go ahead and use it please read about what is wrong with system \
mode: \
 \
http://www.freedesktop.org/wiki/Software/PulseAudio/Documentation/User/WhatIsWrongWithSystemWide"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "16.1"

RPM_NAME = "pulseaudio-system-wide-16.1-4.1.aarch64.rpm"
RPM_HASH = "65243ef7a49ef7d769861e25244ac898f6e96c997292f5ad66d830f9c4f92c9b6fbf3d5113a7021307f0b15267176708e6a6aa37de0747c5ecc06f06e4fd7863"

RPROVIDES:${PN} += "pulseaudio-system-wide"

RDEPENDS:${PN} += "/usr/bin/sh \
pulseaudio \
systemd"

inherit rpm
