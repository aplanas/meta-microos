SUMMARY = "A program for viewing and analysing contents of audio files"
DESCRIPTION = "Sonic Visualiser is a program for viewing and analysing the contents \
of music audio files. \
 \
With Sonic Visualiser you can: \
* Load audio files in various formats and view their waveforms \
 \
* Look at audio visualisations such as spectrogram views, with \
  interactive adjustment of display parameters \
 \
* Annotate audio data by adding labelled time points and defining \
  segments, point values and curves \
 \
* Run feature-extraction plugins to calculate annotations \
  automatically, using algorithms such as beat trackers, pitch \
  detectors and so on \
 \
* Import annotation data from various text formats and MIDI files \
 \
* Play back the original audio with synthesised annotations, taking \
  care to synchronise playback with the display position \
 \
* Slow down playback and loop segments of interest, including \
  seamless looping of complex non-contiguous areas \
 \
* Export annotations and audio selections to external files. \
 \
* Sonic Visualiser can also be controlled remotely using the Open Sound \
  Control (OSC) protocol"
LICENSE = "GPL-2.0-or-later"

PV = "4.5"

RPM_NAME = "sonic-visualiser-4.5-2.6.aarch64.rpm"
RPM_HASH = "421ed9d01a6c3f86cdc0a1f64848be7a03a7ee1c08eaa8cce69ba2ccf447a372c699c57f2e6ce2c4df3fbff8a64d2cad6b9c1e8948dbf911ee48a7b508be64af"

RPROVIDES:${PN} += "application() \
application(sonic-visualiser.desktop) \
mimehandler(application/ogg) \
mimehandler(application/x-ogg) \
mimehandler(application/x-sonicvisualiser) \
mimehandler(application/x-sonicvisualiser-layer) \
mimehandler(audio/mp3) \
mimehandler(audio/mpeg) \
mimehandler(audio/mpegurl) \
mimehandler(audio/ogg) \
mimehandler(audio/wav) \
mimehandler(audio/x-flac) \
mimehandler(audio/x-mp3) \
mimehandler(audio/x-mpeg) \
mimehandler(audio/x-mpegurl) \
mimehandler(audio/x-vorbis+ogg) \
mimehandler(audio/x-wav) \
sonic-visualiser \
sonic-visualiser(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
dssi \
ladspa \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libasound.so.2()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libcapnp-0.10.4.so()(64bit) \
libfftw3.so.3()(64bit) \
libfishsound.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libid3tag.so.0.16.2()(64bit) \
libkj-0.10.4.so()(64bit) \
liblo.so.7()(64bit) \
liblrdf.so.2()(64bit) \
libm.so.6()(64bit) \
libmad.so.0()(64bit) \
liboggz.so.2()(64bit) \
libopusfile.so.0()(64bit) \
libportaudio.so.2()(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
librubberband.so.2()(64bit) \
libsamplerate.so.0()(64bit) \
libserd-0.so.0()(64bit) \
libsndfile.so.1()(64bit) \
libsord-0.so.0()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
