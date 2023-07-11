SUMMARY = "Audio/video file technical and tag information utility"
DESCRIPTION = "MediaInfo supplies technical and tag information about a video or \
audio file. \
 \
It reads the following information: \
* General: title, author, director, album, track number, date, duration... \
* Video: codec, aspect, fps, bitrate... \
* Audio: codec, sample rate, channels, language, bitrate... \
* Text: language of subtitle \
* Chapters: number of chapters, list of chapters \
 \
It supports the following containers/codecs: \
* Video: MKV, OGM, AVI, DivX, WMV, QuickTime, Real, MPEG-1, \
  MPEG-2, MPEG-4, DVD (VOB) (Codecs: DivX, XviD, MSMPEG4, ASP, \
  H.264, AVC...) \
* Audio: OGG, MP3, WAV, RA, AC3, DTS, AAC, M4A, AU, AIFF \
* Subtitles: SRT, SSA, ASS, SAMI"
LICENSE = "GPL-2.0-or-later"

PV = "23.06"

RPM_NAME = "mediainfo-23.06-1.1.aarch64.rpm"
RPM_HASH = "a0403006eafd4d1cedaaf15dbb3ed1cec45124629465c0de91f46a214fcbe2a6c1c06a2f4051c5b5e961c849fe281224c3c4ae1c6e83303473648778241ab0d1"

RPROVIDES:${PN} += "MediaInfo \
mediainfo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmediainfo.so.0 \
libstdc++.so.6 \
libzen.so.0"

inherit rpm
