SUMMARY = "Python Left-Right Parser"
DESCRIPTION = "Python Left-Right Parser."
LICENSE = "MIT"

PV = "1.3.3"

RPM_NAME = "python311-pyleri-1.3.3-1.10.noarch.rpm"
RPM_HASH = "665dc406e6f0a9aee3838ab288c2cc8162b6851a17773232c83954d42db383c34b5cb2d44c5d941afca930ac8c74baffda790bd6e4644ea8a1a40b4a500f4188"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyleri \
python3.11dist-pyleri \
python311-pyleri \
python3dist-pyleri"

RDEPENDS:${PN} += "python-abi"

inherit rpm
