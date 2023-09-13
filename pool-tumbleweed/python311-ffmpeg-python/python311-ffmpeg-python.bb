SUMMARY = "Python bindings for FFmpeg"
DESCRIPTION = "Python bindings for FFmpeg - with complex filtering support"
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "python311-ffmpeg-python-0.2.0-7.1.noarch.rpm"
RPM_HASH = "e0a088bf1e2a1cf26cf4719e248e25c522e18088ad548371e8371b5dc3d2047dda8934e62c19ed9338c84829faf973cdd053c114d969fefc4b5a1ac38d0782a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ffmpeg-python \
python3.11dist-ffmpeg-python \
python311-ffmpeg-python \
python3dist-ffmpeg-python"

RDEPENDS:${PN} += "python-abi"

inherit rpm
