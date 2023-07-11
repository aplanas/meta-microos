SUMMARY = "Terminal string styling done right, in Python"
DESCRIPTION = "colorful gives you control over terminal string styling in Python \
with an easy to use API."
LICENSE = "MIT"

PV = "0.5.5"

RPM_NAME = "python39-colorful-0.5.5-1.5.noarch.rpm"
RPM_HASH = "960622749dc0a5ed7308a7ed52e49dd9e573a93260b54d1bca12e34a0ed589ddc071e3b39e33bf8e3f317d4c35fd64b0764d0db927518bc74e25a316abb07a75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-colorful \
python39-colorful \
python3dist-colorful"

RDEPENDS:${PN} += "python-abi"

inherit rpm
