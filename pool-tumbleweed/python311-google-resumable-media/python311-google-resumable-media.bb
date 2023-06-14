SUMMARY = "Utilities for Google Media Downloads and Resumable Uploads"
DESCRIPTION = "Utilities for Google Media Downloads and Resumable Uploads"
LICENSE = "Apache-2.0"

PV = "2.5.0"

RPM_NAME = "python311-google-resumable-media-2.5.0-1.1.noarch.rpm"
RPM_HASH = "c9e580d5c747ddfd2ce59196b84be46665de78d3fcdbaf59535ce4ab7c6cdf9b156200ca2fc8d1fb27a79dcb2d3035d55796c12bf021167024257caa660c6752"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-google-resumable-media \
python311-google-resumable-media \
python3dist-google-resumable-media"

RDEPENDS:${PN} += "python-abi \
python311-google-crc32c"

inherit rpm
