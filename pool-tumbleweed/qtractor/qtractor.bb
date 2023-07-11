SUMMARY = "An Audio/MIDI multi-track sequencer"
DESCRIPTION = "Qtractor is an Audio/MIDI multi-track sequencer application \
written in C++ around the Qt toolkit. \
 \
The initial target platform will be Linux, where the Jack Audio \
Connection Kit (JACK) for audio, and the Advanced Linux Sound \
Architecture (ALSA) for MIDI, are the main infrastructures to \
evolve as a fairly-featured Linux Desktop Audio Workstation GUI, \
specially dedicated to the personal home-studio."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.32"

RPM_NAME = "qtractor-0.9.32-2.2.aarch64.rpm"
RPM_HASH = "62aff72023042154dd92650a203f9cdf4dc03d9d1ba4df926b406b95854efba134ec7816be2a85dbc692f47c59606ff7d9b76e225c87610e0025af1270bb69a4"

RPROVIDES:${PN} += "qtractor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libasound.so.2 \
libaubio.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-x11-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libjack.so.0 \
liblilv-0.so.0 \
liblo.so.7 \
libm.so.6 \
libmad.so.0 \
libogg.so.0 \
librubberband.so.2 \
libsamplerate.so.0 \
libsndfile.so.1 \
libstdc++.so.6 \
libvorbis.so.0 \
libvorbisenc.so.2 \
libvorbisfile.so.3 \
libxcb.so.1 \
libz.so.1"

inherit rpm
