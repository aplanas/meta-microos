SUMMARY = "FFMPEG wrapper for Python"
DESCRIPTION = "FFMPEG wrapper for working with video files in Python."
LICENSE = "BSD-2-Clause"

PV = "0.4.8"

RPM_NAME = "python310-imageio-ffmpeg-0.4.8-2.1.noarch.rpm"
RPM_HASH = "1e6c7be838a4154c475e3b5632cf60efcd1bf4becd5708bd91c6168f98c677f897676ff363d808ef70ea944a63b3b6cfe5b0db440f30ced44ff64a234338ca22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-imageio-ffmpeg \
python310-imageio-ffmpeg \
python3dist-imageio-ffmpeg"

RDEPENDS:${PN} += "ffmpeg-4 \
python-abi"

inherit rpm
