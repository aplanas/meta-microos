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

PV = "23.07"

RPM_NAME = "mediainfo-23.07-1.1.aarch64.rpm"
RPM_HASH = "a41fba8cda4eec08060062b3f89b93dc1176d0f20db9077362f4c352917ad862385683a314146cc5ac91536e54f81382bc2dd716657ac353c8be2db212b5646f"

RPROVIDES:${PN} += "MediaInfo \
mediainfo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmediainfo.so.0 \
libstdc++.so.6 \
libzen.so.0"

inherit rpm
