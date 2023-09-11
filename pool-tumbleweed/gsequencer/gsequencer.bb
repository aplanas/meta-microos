SUMMARY = "Audio processing engine"
DESCRIPTION = "Advanced Gtk+ Sequencer is an audio \
sequencer application supporting the LADPSA, DSSI and Lv2 plugin \
formats. It can output to Pulseaudio server, JACK and ALSA. \
 \
You may add multiple sinks, mix different sources by producing \
sound with different sequencers. Furthermore, it features a pattern \
and piano roll and there is an editor to automate ports."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & GFDL-1.3-only"

PV = "6.0.8"

RPM_NAME = "gsequencer-6.0.8-1.1.aarch64.rpm"
RPM_HASH = "0793cad776a53b14dde657730e4b179f20b92e871d8941e5d935cbc3c57cce96b91d1344f427ebb517e15b9282a45390bf9437ade1c521334f8271e00e8544eb"

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
