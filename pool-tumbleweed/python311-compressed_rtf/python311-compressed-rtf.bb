SUMMARY = "Compressed Rich Text Format (RTF) compression and decompression package"
DESCRIPTION = "Compressed Rich Text Format (RTF) compression and decompression package"
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "python311-compressed_rtf-1.0.6-1.8.noarch.rpm"
RPM_HASH = "1bc06646524810be93e6be71d149b74d704e104a278363d3b60d763194a849bc0936fb52a2f19aaeab61aa8e059bdf501247a8c224a86d3a741d8a0b19ae6842"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-compressed-rtf \
python311-compressed-rtf \
python3dist-compressed-rtf"

RDEPENDS:${PN} += "python-abi"

inherit rpm
