SUMMARY = "Python bindings for FFmpeg"
DESCRIPTION = "Python bindings for FFmpeg - with complex filtering support"
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "python310-ffmpeg-python-0.2.0-7.1.noarch.rpm"
RPM_HASH = "3de4c912026dd09e80af8ca91ec16190aa9aa114839b8047436551d48a10e8192f39cf399b5e76b107c364f7209bdec2dd47190cd4e00de9d4f5b078d684f19c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ffmpeg-python \
python310-ffmpeg-python \
python3dist-ffmpeg-python"

RDEPENDS:${PN} += "python-abi"

inherit rpm
