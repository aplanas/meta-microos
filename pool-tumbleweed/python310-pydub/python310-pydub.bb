SUMMARY = "Audio manipulation with Python"
DESCRIPTION = "A Python module to manipulate audio with a high level interface."
LICENSE = "MIT"

PV = "0.25.1"

RPM_NAME = "python310-pydub-0.25.1-2.4.noarch.rpm"
RPM_HASH = "a231d77c4a9f5a7fd456f03d5386cd69cfe09efb1203e609d80c52319d8b9f1aa94489129eaff2d818e6132d506eb0459b5235c809aa78aff807cd9001034aab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pydub \
python310-pydub \
python3dist-pydub"

RDEPENDS:${PN} += "ffmpeg \
python-abi"

inherit rpm
