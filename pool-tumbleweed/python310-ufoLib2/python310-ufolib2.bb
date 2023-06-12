SUMMARY = "UFO font processing library"
DESCRIPTION = "ufoLib2 is a UFO font processing library."
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "python310-ufoLib2-0.13.1-1.3.noarch.rpm"
RPM_HASH = "8f60ed17135904a432b8fa87a5de59f59094c131eb5027b94665fd3e57fda227ede1955705734b7e9f9274a54e61cf5954421a800c95877dc5b2a39d423b8aa7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ufoLib2 \
python3.10dist(ufolib2) \
python310-ufoLib2 \
python3dist(ufolib2)"
RDEPENDS:${PN} += "python(abi) \
python310-FontTools \
python310-attrs \
python310-fs"

inherit rpm
