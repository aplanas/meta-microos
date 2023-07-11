SUMMARY = "Python bindings for FFmpeg"
DESCRIPTION = "Python bindings for FFmpeg - with complex filtering support"
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "python311-ffmpeg-python-0.2.0-6.6.noarch.rpm"
RPM_HASH = "afafee38b7d310256372d3cc3a2a2de90643c963393476c9eb96e910a03bf90e4660579d7ddf01aa885881f601b1e1f657401132dad2f8b8aba2f3fe120eeb61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ffmpeg-python \
python3.11dist-ffmpeg-python \
python311-ffmpeg-python \
python3dist-ffmpeg-python"

RDEPENDS:${PN} += "python-abi \
python311-future"

inherit rpm
