SUMMARY = "Python bindings for Xiphorg's Ogg Vorbis, Opus and FLAC"
DESCRIPTION = "PyOgg provides bindings for Xiph.org's OGG Vorbis, OGG Opus and FLAC \
audio file formats."
LICENSE = "BSD-3-Clause"

PV = "0.6.14a1"

RPM_NAME = "python39-PyOgg-0.6.14a1-1.5.noarch.rpm"
RPM_HASH = "dd8f39a599f5b018240f98e9bab17278bc3f3ca65812d3ecfbb2431c36bd6ae06ca699720ac774c26160493a16a6f22efae2207341f487dc59cc5e3f0bc24225"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyogg \
python39-PyOgg \
python3dist-pyogg"

RDEPENDS:${PN} += "python-abi"

inherit rpm
