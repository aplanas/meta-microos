SUMMARY = "Compressed Rich Text Format (RTF) compression and decompression package"
DESCRIPTION = "Compressed Rich Text Format (RTF) compression and decompression package"
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "python311-compressed_rtf-1.0.6-1.9.noarch.rpm"
RPM_HASH = "6552434ddc8a40dad774750c004b2ccfcf6747be8e1838e95acc2510b88ecbf05f644f091a7eacfb1a62065f5d0f1888a47158ad207b317b2aec75a4f7df2496"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-compressed-rtf \
python3.11dist-compressed-rtf \
python311-compressed-rtf \
python3dist-compressed-rtf"

RDEPENDS:${PN} += "python-abi"

inherit rpm
