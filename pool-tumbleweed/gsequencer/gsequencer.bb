SUMMARY = "Audio processing engine"
DESCRIPTION = "Advanced Gtk+ Sequencer is an audio \
sequencer application supporting the LADPSA, DSSI and Lv2 plugin \
formats. It can output to Pulseaudio server, JACK and ALSA. \
 \
You may add multiple sinks, mix different sources by producing \
sound with different sequencers. Furthermore, it features a pattern \
and piano roll and there is an editor to automate ports."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & GFDL-1.3-only"

PV = "5.2.5"

RPM_NAME = "gsequencer-5.2.5-1.1.aarch64.rpm"
RPM_HASH = "a9e883f05cac4dd3d5bbd1cff30bf05eb7a6c31275733fb8701091afc9835d9b06f413e4f34c9aada71af88ebbabd4550329c3cc4cdebb71739d0aee4fc78fac"

RPROVIDES:${PN} += "gsequencer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libags-audio.so.5 \
libags.so.5 \
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
