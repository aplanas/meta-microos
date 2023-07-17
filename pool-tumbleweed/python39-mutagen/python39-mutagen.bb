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

RPM_NAME = "python39-mutagen-1.46.0-2.1.noarch.rpm"
RPM_HASH = "7f2c021c814f433f855f2f17460d70a447d03b1d9d5fb71359484123f1c6d94282c5605b2e7165676771407b90a7a8d1a66fb46c845f50141ff7ca1bec3498e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mutagen \
python39-mutagen \
python3dist-mutagen"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
