SUMMARY = "Python bindings for FFmpeg"
DESCRIPTION = "Python bindings for FFmpeg - with complex filtering support"
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "python39-ffmpeg-python-0.2.0-6.4.noarch.rpm"
RPM_HASH = "d7b57f62b3433872417c00e7f8c53dffa191fce3e7f277c78329693914c14f1f5fc10799d12b2d2448df73d07d0ce0c4ce21351f906f8eed857b8dfda0d04966"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ffmpeg-python) \
python39-ffmpeg-python \
python3dist(ffmpeg-python)"
RDEPENDS:${PN} += "python(abi) \
python39-future"

inherit rpm
