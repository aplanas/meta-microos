SUMMARY = "Audio processing engine"
DESCRIPTION = "Advanced Gtk+ Sequencer is an audio \
sequencer application supporting the LADPSA, DSSI and Lv2 plugin \
formats. It can output to Pulseaudio server, JACK and ALSA. \
 \
You may add multiple sinks, mix different sources by producing \
sound with different sequencers. Furthermore, it features a pattern \
and piano roll and there is an editor to automate ports."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & GFDL-1.3-only"

PV = "6.0.1"

RPM_NAME = "gsequencer-6.0.1-1.1.aarch64.rpm"
RPM_HASH = "9b8b243a7f1f0f388902987c89c0948a4e17e3e37b04d44c14891de18133d259efa8853192eab7f106510675c5703ce84c9608497130ab9f13d044cb6a4c4b97"

RPROVIDES:${PN} += "gsequencer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libags-audio.so.6 \
libags.so.6 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgsequencer.so.0 \
libgstreamer-1.0.so.0 \
libgtk-4.so.1 \
libinstpatch-1.0.so.2 \
libxml2.so.2"

inherit rpm
