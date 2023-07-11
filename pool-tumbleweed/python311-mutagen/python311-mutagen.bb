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

RPM_NAME = "python311-mutagen-1.46.0-1.6.noarch.rpm"
RPM_HASH = "6b394d060a96666dd6244645a7aab3a63110380604542233a602324fda4503b761ed72c9f32a72256017e1e4063de9e910197e61d0e63e5b4b690cbca11e8a77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mutagen \
python3.11dist-mutagen \
python311-mutagen \
python3dist-mutagen"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
