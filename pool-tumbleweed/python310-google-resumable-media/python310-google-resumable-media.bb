SUMMARY = "Utilities for Google Media Downloads and Resumable Uploads"
DESCRIPTION = "Utilities for Google Media Downloads and Resumable Uploads"
LICENSE = "Apache-2.0"

PV = "2.5.0"

RPM_NAME = "python310-google-resumable-media-2.5.0-1.3.noarch.rpm"
RPM_HASH = "f2f4b7506dc535a3967bdb92612cdf47ab27ecf6a8d128c7b3bfa387ee21ee41f74698a697c57b1ffa6ab2fa1da926a9609a1cb65c62ea302376095b99e8eeb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-google-resumable-media \
python310-google-resumable-media \
python3dist-google-resumable-media"

RDEPENDS:${PN} += "python-abi \
python310-google-crc32c"

inherit rpm
