SUMMARY = "FFMPEG wrapper for Python"
DESCRIPTION = "FFMPEG wrapper for working with video files in Python."
LICENSE = "BSD-2-Clause"

PV = "0.4.8"

RPM_NAME = "python310-imageio-ffmpeg-0.4.8-1.4.noarch.rpm"
RPM_HASH = "bbcc5bcee069fedb4481537d58d130c8e6a1cffb3bf3778e5789205b5ee9c4eb625f87a767af24500296c24559b762ffea62541547c8658199598d087fedcb52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-imageio-ffmpeg \
python310-imageio-ffmpeg \
python3dist-imageio-ffmpeg"

RDEPENDS:${PN} += "ffmpeg-4 \
python-abi"

inherit rpm
