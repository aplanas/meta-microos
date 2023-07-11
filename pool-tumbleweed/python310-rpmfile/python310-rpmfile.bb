SUMMARY = "Python module to read rpm files"
DESCRIPTION = "Tools for inspecting RPM files in python. This module is modeled after the tarfile module."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "python310-rpmfile-1.0.4-1.14.noarch.rpm"
RPM_HASH = "0a3a8b3df8a56472afb27c4be0c2d6facff3bb9c482e87a0f227539e519b6ce8dfa1367b7097657c7b8701a4ccc4682c9a3710a3a1c2f7b2ff5a53eb48c267c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-rpmfile \
python310-rpmfile \
python3dist-rpmfile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
