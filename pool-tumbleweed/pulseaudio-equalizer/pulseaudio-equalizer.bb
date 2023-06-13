SUMMARY = "PulseAudio's LADSPA plugin graphical user interface"
DESCRIPTION = "GUI for PulseAudio's LADSPA interface using Steve Harris' Multiband EQ \
(mbeq_1197) plugin."
LICENSE = "GPL-3.0-or-later"

PV = "3.0.2"

RPM_NAME = "pulseaudio-equalizer-3.0.2-1.6.noarch.rpm"
RPM_HASH = "caacf6999ba07f0069305f05670040e8db1e464aacbe872cd3b869bdaac65246df96638f518eb11bf0f260cafb244b68c835cf1c877cb850bf9a3f729fa6351e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(com.github.pulseaudio-equalizer-ladspa.Equalizer.desktop) \
pulseaudio-equalizer"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/python3 \
bc \
ladspa-swh-plugins \
pulseaudio-daemon \
pulseaudio-utils \
python(abi) \
python3-gobject \
python3-gobject-Gdk \
typelib(GLib) \
typelib(Gio) \
typelib(Gtk)"

inherit rpm
