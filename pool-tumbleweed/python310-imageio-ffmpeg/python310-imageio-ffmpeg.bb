SUMMARY = "FFMPEG wrapper for Python"
DESCRIPTION = "FFMPEG wrapper for working with video files in Python."
LICENSE = "BSD-2-Clause"

PV = "0.4.8"

RPM_NAME = "python310-imageio-ffmpeg-0.4.8-1.2.noarch.rpm"
RPM_HASH = "33f67b569bb03229a597f2fe7da280cf553c9ba85d94edbe724d9b5d3dec0e7537c2763932b8e177137ecad6da59b47a6317af13caadc4917c4c0e3e47416063"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-imageio-ffmpeg \
python3.10dist(imageio-ffmpeg) \
python310-imageio-ffmpeg \
python3dist(imageio-ffmpeg)"

RDEPENDS:${PN} += "ffmpeg-4 \
python(abi)"

inherit rpm
