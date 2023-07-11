SUMMARY = "Compressed Rich Text Format (RTF) compression and decompression package"
DESCRIPTION = "Compressed Rich Text Format (RTF) compression and decompression package"
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "python39-compressed_rtf-1.0.6-1.9.noarch.rpm"
RPM_HASH = "bfd38bd6a68c039df78f587671968a4333cf5c84864dd0b546558411b1efc8a243dd4b6c5d893c4eb3ce25ba1b5aa83656ad0d82b578c24945713753f1755246"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-compressed-rtf \
python39-compressed-rtf \
python3dist-compressed-rtf"

RDEPENDS:${PN} += "python-abi"

inherit rpm
