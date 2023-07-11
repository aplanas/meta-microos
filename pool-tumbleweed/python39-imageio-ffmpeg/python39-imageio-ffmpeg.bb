SUMMARY = "FFMPEG wrapper for Python"
DESCRIPTION = "FFMPEG wrapper for working with video files in Python."
LICENSE = "BSD-2-Clause"

PV = "0.4.8"

RPM_NAME = "python39-imageio-ffmpeg-0.4.8-1.4.noarch.rpm"
RPM_HASH = "519377133a4314047304ce63f306ac2117d3c006087f450c928a6b1f9fcdcc81963690513621ce6d5e5c4111997fc316d9c606aa4ca2e199bae46b206744afd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-imageio-ffmpeg \
python39-imageio-ffmpeg \
python3dist-imageio-ffmpeg"

RDEPENDS:${PN} += "ffmpeg-4 \
python-abi"

inherit rpm
