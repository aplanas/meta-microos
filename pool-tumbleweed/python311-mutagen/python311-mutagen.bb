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

RPM_NAME = "python311-mutagen-1.46.0-1.4.noarch.rpm"
RPM_HASH = "f039f1fd304a5736e72db297b4e875a26f579a8e3b5fb6bbbfdff27b15c424d53bcf5a2cdd893eb03773f31f8510c97abeeb28502c11c7f655986b2a6db0164a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-mutagen \
python311-mutagen \
python3dist-mutagen"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
