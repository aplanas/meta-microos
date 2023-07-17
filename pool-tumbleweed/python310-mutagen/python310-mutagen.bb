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

RPM_NAME = "python310-mutagen-1.46.0-2.1.noarch.rpm"
RPM_HASH = "dbd1fc888fe1b6efbf9efac9d5d2bbd0e3205e2a2fbd61f9ad6181fc8947613e1be35ba86d2434f6bc8079bb439af869171629d8250f845525096fb401b28116"
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
