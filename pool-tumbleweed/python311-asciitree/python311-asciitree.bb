SUMMARY = "Python module to draw ASCII trees"
DESCRIPTION = "ASCIItree draws tree structures using characters."
LICENSE = "MIT"

PV = "0.3.3"

RPM_NAME = "python311-asciitree-0.3.3-3.11.noarch.rpm"
RPM_HASH = "f6a1ae709f67e6595cff5543e60987c21f12b90a0ac7545be30a29ba0eaf53c06ee0022992d48d15c791485d2969b72c747f2336c652f8343422f7ba335a7ad5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(asciitree) \
python311-asciitree \
python3dist(asciitree)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
