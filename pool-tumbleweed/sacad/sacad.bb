SUMMARY = "Search and download music album covers"
DESCRIPTION = "SACAD is a multi platform command line tool to download album covers \
without manual intervention, ideal for integration in scripts, audio \
players, etc."
LICENSE = "MPL-2.0"

PV = "2.7.4"

RPM_NAME = "sacad-2.7.4-1.2.noarch.rpm"
RPM_HASH = "96c1be00ea7b33766da77b9bf69ab73db05b3fb2ccffca3c82d7816989748b25cadad4c00e38aa11bd3fb516b9e550928376b8ff7456405e9d9849e0186426e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-sacad \
python3dist-sacad \
sacad"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-Pillow \
python3-Unidecode \
python3-aiohttp \
python3-appdirs \
python3-bitarray \
python3-cssselect \
python3-fake-useragent \
python3-lxml \
python3-mutagen \
python3-tqdm \
python3-web-cache"

inherit rpm
