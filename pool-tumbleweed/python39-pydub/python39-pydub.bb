SUMMARY = "Audio manipulation with Python"
DESCRIPTION = "A Python module to manipulate audio with a high level interface."
LICENSE = "MIT"

PV = "0.25.1"

RPM_NAME = "python39-pydub-0.25.1-2.3.noarch.rpm"
RPM_HASH = "fa49479bb3ac1e5d1d8aaad879544e4321aa4effabaeed1f87242541f0a16628bacf35a6c3e5fd0da45c63eb13673ff6e52ab31e9027daf751b33c85744fdc71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pydub \
python39-pydub \
python3dist-pydub"

RDEPENDS:${PN} += "ffmpeg \
python-abi"

inherit rpm
