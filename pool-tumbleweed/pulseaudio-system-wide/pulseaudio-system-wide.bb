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

RPM_NAME = "pulseaudio-system-wide-16.1-3.1.aarch64.rpm"
RPM_HASH = "e190cc59dc71293e7f9da3db14cdee1efd50052b4e0547500f0a668ea9062acd827aaffccbdfcc47c0751dbe439ff5ca59af0eca9fb11514d261df31610248e8"

RPROVIDES:${PN} += "pulseaudio-system-wide \
pulseaudio-system-wide(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
pulseaudio \
systemd"

inherit rpm
