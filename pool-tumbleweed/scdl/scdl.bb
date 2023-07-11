SUMMARY = "Souncloud Music Downloader"
DESCRIPTION = "The program can download music from SoundCloud and set id3tag to the downloaded music."
LICENSE = "GPL-2.0-only"

PV = "2.7.3"

RPM_NAME = "scdl-2.7.3-1.3.noarch.rpm"
RPM_HASH = "25cc853dca328b50a0cb436bf2107eae547081db475af8bffaae7770cd43bc29d87ee7326116e75d298403aad5dfac720a17aeb74bef4557705b2f33e8d058db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-scdl \
python3dist-scdl \
scdl"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-clint \
python3-docopt \
python3-mutagen \
python3-requests \
python3-termcolor"

inherit rpm
