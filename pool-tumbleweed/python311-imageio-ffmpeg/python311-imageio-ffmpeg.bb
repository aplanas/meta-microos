SUMMARY = "FFMPEG wrapper for Python"
DESCRIPTION = "FFMPEG wrapper for working with video files in Python."
LICENSE = "BSD-2-Clause"

PV = "0.4.8"

RPM_NAME = "python311-imageio-ffmpeg-0.4.8-1.4.noarch.rpm"
RPM_HASH = "97d09ee51a4c681cdae2a23c338cc509a06ebbbf293dce16b4de155bb8fa9ae86f2c7c3a3fc46af888738cd056644ca258b92678fc755955dfb836b534cf3541"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-imageio-ffmpeg \
python3.11dist-imageio-ffmpeg \
python311-imageio-ffmpeg \
python3dist-imageio-ffmpeg"

RDEPENDS:${PN} += "ffmpeg-4 \
python-abi"

inherit rpm
