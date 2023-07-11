SUMMARY = "Utilities for Google Media Downloads and Resumable Uploads"
DESCRIPTION = "Utilities for Google Media Downloads and Resumable Uploads"
LICENSE = "Apache-2.0"

PV = "2.5.0"

RPM_NAME = "python311-google-resumable-media-2.5.0-1.3.noarch.rpm"
RPM_HASH = "660e31731c89407ec5555a0b5a44643012cb5c74df35ba0a3ba193a06f1b65d7369d65cc4af61401b83494a7076c302cb4bbf885a1c7c4222e8982685f1ba1f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-resumable-media \
python3.11dist-google-resumable-media \
python311-google-resumable-media \
python3dist-google-resumable-media"

RDEPENDS:${PN} += "python-abi \
python311-google-crc32c"

inherit rpm
