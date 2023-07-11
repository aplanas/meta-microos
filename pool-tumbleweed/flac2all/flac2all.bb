SUMMARY = "A multithreaded FLAC to MP3/OGG/FLAC batch converter"
DESCRIPTION = "Flac2All is a multi-threaded script that will convert your collection of \
FLAC files into either Ogg Vorbis, MP3 (with the Lame encoder), or FLAC, \
complete with any tags and identical file/folder structure."
LICENSE = "GPL-3.0-only"

PV = "5.1"

RPM_NAME = "flac2all-5.1-1.10.noarch.rpm"
RPM_HASH = "9335e7cb09b051bfe65c81222462c357d35b00e15005fe398f84aca4b44cdf37d13188df06d814b2a1e3c9603cac4c48e081a6eaf79e44eee833bb216b5cc20c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flac2all \
python3.11dist-flac2all \
python3dist-flac2all"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-curses"

inherit rpm
