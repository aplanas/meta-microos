SUMMARY = "Utilities for Google Media Downloads and Resumable Uploads"
DESCRIPTION = "Utilities for Google Media Downloads and Resumable Uploads"
LICENSE = "Apache-2.0"

PV = "2.5.0"

RPM_NAME = "python310-google-resumable-media-2.5.0-1.1.noarch.rpm"
RPM_HASH = "80e795d9817d19f59d20b62227a47ec208fa2c5f98c809b7d303e5e2b0ff99788351a5d9f9a07a49a887557e9ac1ee8fa402aadfee2c7b379c2bb1b79cb6203b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-resumable-media \
python3.10dist(google-resumable-media) \
python310-google-resumable-media \
python3dist(google-resumable-media)"

RDEPENDS:${PN} += "python(abi) \
python310-google-crc32c"

inherit rpm
