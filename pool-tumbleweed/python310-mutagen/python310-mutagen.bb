SUMMARY = "Python module to Handle Audio Metadata"
DESCRIPTION = "Mutagen is a Python module to handle audio metadata. It supports FLAC, \
M4A, MP3, Ogg FLAC, Ogg Speex, Ogg Theora, Ogg Vorbis, True Audio, and \
WavPack audio files. All versions of ID3v2 are supported, and all \
standard ID3v2.4 frames are parsed. It can read Xing headers to \
accurately calculate the bitrate and length of MP3s. ID3 and APEv2 tags \
can be edited regardless of their audio format. It can also manipulate \
Ogg streams on an individual packet/page level."
LICENSE = "GPL-2.0-or-later"

PV = "1.46.0"

RPM_NAME = "python310-mutagen-1.46.0-1.6.noarch.rpm"
RPM_HASH = "6ffc8597e321028d4cd9a41099fb4c440c2d1cc1020092d8db99f643bd4d6ea67decaef6fd03a25f4a22b67a90e1b7398296e5b25f51bf3b9931dc396b8e55c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mutagen \
python310-mutagen \
python3dist-mutagen"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
