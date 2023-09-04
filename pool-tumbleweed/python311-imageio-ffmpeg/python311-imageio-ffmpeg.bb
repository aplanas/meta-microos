SUMMARY = "FFMPEG wrapper for Python"
DESCRIPTION = "FFMPEG wrapper for working with video files in Python."
LICENSE = "BSD-2-Clause"

PV = "0.4.8"

RPM_NAME = "python311-imageio-ffmpeg-0.4.8-2.1.noarch.rpm"
RPM_HASH = "a41ab9717eb3de2ff2f78b5133b02ed6c85648dacf16f8a3365d783fbbfbba4ebf3c92c799af383fe5d6ec40b0acaddbae516f444fa7f3643aa8ae2dbd48584b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-imageio-ffmpeg \
python3.11dist-imageio-ffmpeg \
python311-imageio-ffmpeg \
python3dist-imageio-ffmpeg"

RDEPENDS:${PN} += "ffmpeg-4 \
python-abi"

inherit rpm
