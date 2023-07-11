SUMMARY = "Python bindings for FFmpeg"
DESCRIPTION = "Python bindings for FFmpeg - with complex filtering support"
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "python39-ffmpeg-python-0.2.0-6.6.noarch.rpm"
RPM_HASH = "c4d818753992a21307ad09a108a6ed77b3e73c446c05ce963cdbbd5ec55a37bc6d05233c005ab7f82af165b39d994d2873cafa35691cda04ef9baf525195a7fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ffmpeg-python \
python39-ffmpeg-python \
python3dist-ffmpeg-python"

RDEPENDS:${PN} += "python-abi \
python39-future"

inherit rpm
