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

RPROVIDES:${PN} += "sonic-visualiser"

RDEPENDS:${PN} += "/usr/bin/sh \
dssi \
ladspa \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libasound.so.2 \
libbz2.so.1 \
libc.so.6 \
libcapnp-0.10.4.so \
libfftw3.so.3 \
libfishsound.so.1 \
libgcc-s.so.1 \
libid3tag.so.0.16.2 \
libkj-0.10.4.so \
liblo.so.7 \
liblrdf.so.2 \
libm.so.6 \
libmad.so.0 \
liboggz.so.2 \
libopusfile.so.0 \
libportaudio.so.2 \
libpulse.so.0 \
librubberband.so.2 \
libsamplerate.so.0 \
libserd-0.so.0 \
libsndfile.so.1 \
libsord-0.so.0 \
libstdc++.so.6"

inherit rpm
