SUMMARY = "FFMPEG wrapper for Python"
DESCRIPTION = "FFMPEG wrapper for working with video files in Python."
LICENSE = "BSD-2-Clause"

PV = "0.4.8"

RPM_NAME = "python311-imageio-ffmpeg-0.4.8-1.2.noarch.rpm"
RPM_HASH = "24f292b3d687553564e203b46b75b90ad987f86419c1ebf5cb1864668e7280d7b2cdc6b452962cb505190797887880014777f983e4fd549921a311611622e5fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(imageio-ffmpeg) \
python311-imageio-ffmpeg \
python3dist(imageio-ffmpeg)"

RDEPENDS:${PN} += "ffmpeg-4 \
python(abi)"

inherit rpm
