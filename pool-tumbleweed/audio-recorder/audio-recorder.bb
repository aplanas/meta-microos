SUMMARY = "An audio recorder application for the GNOME 2/3"
DESCRIPTION = "Audio-recorder allows you to record music or audio to \
a file. It can record audio from your system's soundcard, \
microphones, browsers and webcams. Put simply: if it plays out of \
your loudspeakers, you can record it. \
 \
It has an advanced timer that can: \
* Start, stop or pause recording at a given clock time. \
* Start, stop or pause after a time period. \
* Stop when the recorded file size exceeds a limit. \
* Start recording on voice or sound. \
* Stop or pause recording on 'silence'. \
 \
The recording can be automatically controlled by all MPRIS2 \
compatible players. \
 \
This program supports several audio (output) formats such as Ogg Vorbis \
audio, FLAC, Opus, MP3 and WAV."
LICENSE = "GPL-3.0-only"

PV = "3.3.4"

RPM_NAME = "audio-recorder-3.3.4-1.7.aarch64.rpm"
RPM_HASH = "72f36be635500a1ef34baf601be7db402ce2d89d6dc4b5658c7f5c5b49854b39a2dc447570b6321bbc798f549bd92bb8e1bc2dc2ebf58361da76e5265305e16c"

RPROVIDES:${PN} += "audio-recorder"

RDEPENDS:${PN} += "/usr/bin/sh \
gstreamer-plugins-bad \
gstreamer-plugins-base \
gstreamer-plugins-good \
gstreamer-plugins-ugly \
ld-linux-aarch64.so.1 \
libappindicator3.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libm.so.6"

inherit rpm
