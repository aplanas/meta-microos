SUMMARY = "FFMPEG wrapper for Python"
DESCRIPTION = "FFMPEG wrapper for working with video files in Python."
LICENSE = "BSD-2-Clause"

PV = "0.4.8"

RPM_NAME = "python39-imageio-ffmpeg-0.4.8-2.1.noarch.rpm"
RPM_HASH = "8651a08f6ea9b4e58886536d4ec10357de7808eaefd539a42861ba3019c055ee1646d3c6a4d92337ca76b8990f9a60d01bf274028dc72a8e7b94be09cb8591c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-imageio-ffmpeg \
python39-imageio-ffmpeg \
python3dist-imageio-ffmpeg"

RDEPENDS:${PN} += "ffmpeg-4 \
python-abi"

inherit rpm
