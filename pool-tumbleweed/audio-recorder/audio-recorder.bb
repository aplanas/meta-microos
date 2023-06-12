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

RPM_NAME = "audio-recorder-3.3.4-1.6.aarch64.rpm"
RPM_HASH = "3674f22fed13c3e03c6226c44974a77110301ee4c3f1f56271cc40ed33c50f1705d3c08259a45b40eeb8650572c3f74e11955eed6996126f49cca54723b2dad6"

RPROVIDES:${PN} += "application() \
application(audio-recorder.desktop) \
audio-recorder \
audio-recorder(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
gstreamer-plugins-bad \
gstreamer-plugins-base \
gstreamer-plugins-good \
gstreamer-plugins-ugly \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libappindicator3.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstpbutils-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
