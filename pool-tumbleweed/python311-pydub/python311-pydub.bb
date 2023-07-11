SUMMARY = "Audio manipulation with Python"
DESCRIPTION = "A Python module to manipulate audio with a high level interface."
LICENSE = "MIT"

PV = "0.25.1"

RPM_NAME = "python311-pydub-0.25.1-2.4.noarch.rpm"
RPM_HASH = "2d71989dfa58740bd73f9c007ec078ae8ff7c38232d1f5cdec5deda43f1927568c526015a09e58c892a8235dfce8ad0fd612760fa7bcdf2637fc51d4609edb4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydub \
python3.11dist-pydub \
python311-pydub \
python3dist-pydub"

RDEPENDS:${PN} += "ffmpeg \
python-abi"

inherit rpm
