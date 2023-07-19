SUMMARY = "Library for supplying technical and tag information about a video or audio file"
DESCRIPTION = "MediaInfo supplies technical and tag information about a video or \
audio file. \
 \
Information that can be retrieved: \
* General: title, author, director, album, track number, date, duration... \
* Video: codec, aspect, fps, bitrate... \
* Audio: codec, sample rate, channels, language, bitrate... \
* Text: language of subtitle \
* Chapters: number of chapters, list of chapters \
 \
DivX, XviD, H263, H.263, H264, x264, ASP, AVC, iTunes, MPEG-1, \
MPEG1, MPEG-2, MPEG2, MPEG-4, MPEG4, MP4, M4A, M4V, QuickTime, \
RealVideo, RealAudio, RA, RM, MSMPEG4v1, MSMPEG4v2, MSMPEG4v3, \
VOB, DVD, WMA, VMW, ASF, 3GP, 3GPP, 3GP2 \
 \
Container formats that are supported: \
* Video: MKV, OGM, AVI, DivX, WMV, QuickTime, Real, MPEG-1, \
  MPEG-2, MPEG-4, DVD (VOB) (Codecs: DivX, XviD, MSMPEG4, ASP, \
  H.264, AVC...) \
* Audio: OGG, MP3, WAV, RA, AC3, DTS, AAC, M4A, AU, AIFF \
* Subtitles: SRT, SSA, ASS, SAMI \
 \
This package contains the shared library for MediaInfo(-gui)."
LICENSE = "BSD-2-Clause"

PV = "23.07"

RPM_NAME = "libmediainfo0-23.07-1.1.aarch64.rpm"
RPM_HASH = "e59853a72a74037e89cc3d4cfb67cca1b23b71e4db4ec663894f8089bd1b1db069c567a50e152f18da993406ca829a5fa9d2165a5e1edc395d1948f8788b237d"

RPROVIDES:${PN} += "libmediainfo.so.0 \
libmediainfo0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libm.so.6 \
libmms.so.0 \
libstdc++.so.6 \
libz.so.1 \
libzen.so.0"

inherit rpm
