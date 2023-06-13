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

RPM_NAME = "python310-mutagen-1.46.0-1.4.noarch.rpm"
RPM_HASH = "8e2b34a857c2b668faa4688ddaf37211fe3cf21b1d25a47b8d0060d56009dcade9d4dd69b9959445c52ac836ace92d2e00ae224a195949e8eeb255ba54a9742e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mutagen \
python3.10dist(mutagen) \
python310-mutagen \
python3dist(mutagen)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-setuptools \
update-alternatives"

inherit rpm
