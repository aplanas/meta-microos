SUMMARY = "Video player that gets sync from Jack"
DESCRIPTION = "Xjadeo is a video player that gets sync from JACK. When a \
sequencer like Muse or Rosegarden acts as a timebase master, xjadeo will \
display the video frame in sync with the sequencer transport. This means \
that an audio event can be visually synchronized with a certain frame in \
the movie, which may be useful for creating a soundtrack for \
a video clip."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.12"

RPM_NAME = "xjadeo-0.8.12-1.4.aarch64.rpm"
RPM_HASH = "94cced6c409d9a4bafc867339d53ab9d9207ef135c1178e809272f9d3d9b7fd7bdf6af637c0cab9cd0b9589481084e355a9818aaf04b12f787b14ce9772d75c4"

RPROVIDES:${PN} += "xjadeo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libImlib2.so.1 \
libSDL-1.2.so.0 \
libX11.so.6 \
libXpm.so.4 \
libasound.so.2 \
libavcodec.so.60 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libfreetype.so.6 \
libjack.so.0 \
liblo.so.7 \
libm.so.6 \
libswscale.so.7"

inherit rpm
