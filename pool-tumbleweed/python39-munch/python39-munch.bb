SUMMARY = "A dot-accessible dictionary"
DESCRIPTION = "A dot-accessible dictionary (a la JavaScript objects)."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python39-munch-2.5.0-2.1.noarch.rpm"
RPM_HASH = "fd9ad323a9798ec4ce2d6faf4487b193b27aa62b0fcc5b034e0ab71da464f32b191ea691a46a53f959e351af049a22172058657fd7b97ddf7362caaa29d9ffa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(munch) \
python39-munch \
python3dist(munch)"

RDEPENDS:${PN} += "python(abi) \
python39-six"

inherit rpm
