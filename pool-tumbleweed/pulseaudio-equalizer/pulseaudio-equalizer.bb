SUMMARY = "PulseAudio's LADSPA plugin graphical user interface"
DESCRIPTION = "GUI for PulseAudio's LADSPA interface using Steve Harris' Multiband EQ \
(mbeq_1197) plugin."
LICENSE = "GPL-3.0-or-later"

PV = "3.0.2"

RPM_NAME = "pulseaudio-equalizer-3.0.2-1.7.noarch.rpm"
RPM_HASH = "c861d7561b016856265cdc923800d3cc2ccc02435ae5e3c9fb6702e53b0a045694f5695089bb51c8a33f2beebb61da5b2fcb30a16bdaef141b13c253646edc9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pulseaudio-equalizer"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
bc \
ladspa-swh-plugins \
pulseaudio-daemon \
pulseaudio-utils \
python-abi \
python3-gobject \
python3-gobject-Gdk \
typelib-GLib \
typelib-Gio \
typelib-Gtk"

inherit rpm
