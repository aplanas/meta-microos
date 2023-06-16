SUMMARY = "PulseAudio GDM integration"
DESCRIPTION = "pulseaudio is a networked sound server for Linux and other Unix like \
operating systems and Microsoft Windows. It is intended to be an \
improved drop-in replacement for the Enlightened Sound Daemon (ESOUND). \
 \
This package contains GDM integration hooks for the PulseAudio sound server."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "16.1"

RPM_NAME = "pulseaudio-gdm-hooks-16.1-3.1.aarch64.rpm"
RPM_HASH = "3d9ea39ed5c14acd5c27447abc85770ed54b25a3bf7943191467dcaef5248d294c0073c45c4d6ce82b56797639c14e0c0baf3eec609f4812917dcc5506ff7ec6"

RPROVIDES:${PN} += "pulseaudio-gdm-hooks"

RDEPENDS:${PN} += "/usr/bin/sh \
gdm \
pulseaudio"

inherit rpm
