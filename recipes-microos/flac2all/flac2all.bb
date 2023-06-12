SUMMARY = "A multithreaded FLAC to MP3/OGG/FLAC batch converter"
DESCRIPTION = "Flac2All is a multi-threaded script that will convert your collection of \
FLAC files into either Ogg Vorbis, MP3 (with the Lame encoder), or FLAC, \
complete with any tags and identical file/folder structure."
LICENSE = "GPL-3.0-only"

PV = "5.1"

RPM_NAME = "flac2all-5.1-1.9.noarch.rpm"
RPM_HASH = "f453e3a2db9ce282248319079d0ede17845bb224ee5b911adb2ca982cd9e6f376b42e391dc6035c4cad96d2b9b26ca10e861689352175506e2db469650785879"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flac2all \
python3.10dist(flac2all) \
python3dist(flac2all)"
RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-curses"

inherit rpm
