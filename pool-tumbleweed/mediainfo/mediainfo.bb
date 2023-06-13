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

PV = "23.04"

RPM_NAME = "mediainfo-23.04-1.2.aarch64.rpm"
RPM_HASH = "b256c78fdfbbb137193b7c24e0ec2b06b3293be73bc8583e34114df0703cdffc3ed90c8a32f1adc51ba6128ffce9fe968d3181f6a84ad656f25438018669e251"

RPROVIDES:${PN} += "MediaInfo \
mediainfo \
mediainfo(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libmediainfo.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libzen.so.0()(64bit)"

inherit rpm
