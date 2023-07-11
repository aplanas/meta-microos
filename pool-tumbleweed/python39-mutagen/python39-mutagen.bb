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

RPM_NAME = "python39-mutagen-1.46.0-1.6.noarch.rpm"
RPM_HASH = "e1fc1f9d7ca0be2064fee802fafc398892d98340329349c53400bdd89dc49c6223340062015176127ead870cf348f64bd71f15855ca55bd1440f19d9bba762a6"
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
