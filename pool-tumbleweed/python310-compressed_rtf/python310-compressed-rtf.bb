SUMMARY = "Compressed Rich Text Format (RTF) compression and decompression package"
DESCRIPTION = "Compressed Rich Text Format (RTF) compression and decompression package"
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "python310-compressed_rtf-1.0.6-1.9.noarch.rpm"
RPM_HASH = "adb56371c39b72a915e31a6f267292b3ca83e0b6caee287d9bdf6663ad819b85641e12d4de4ea6e53e53ba967d3dc001d1c3d598e6893e896871dc6b681bcdcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-compressed-rtf \
python310-compressed-rtf \
python3dist-compressed-rtf"

RDEPENDS:${PN} += "python-abi"

inherit rpm
