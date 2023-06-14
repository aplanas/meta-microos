SUMMARY = "FFMPEG wrapper for Python"
DESCRIPTION = "FFMPEG wrapper for working with video files in Python."
LICENSE = "BSD-2-Clause"

PV = "0.4.8"

RPM_NAME = "python39-imageio-ffmpeg-0.4.8-1.2.noarch.rpm"
RPM_HASH = "8e96a00c46178977edb4b98601f667a03d6186bf9d253d64a10ed92b5a7bda9d8db98a4242196cc54ff17aa07813eb9fb5390508b9fe8de02336645eb1f5c9b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-imageio-ffmpeg \
python39-imageio-ffmpeg \
python3dist-imageio-ffmpeg"

RDEPENDS:${PN} += "ffmpeg-4 \
python-abi"

inherit rpm
