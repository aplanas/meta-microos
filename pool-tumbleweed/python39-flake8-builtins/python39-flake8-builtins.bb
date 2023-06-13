SUMMARY = "Flake8 Builtins plugin"
DESCRIPTION = "This plugin checks for Python builtins being used as variables or parameters."
LICENSE = "GPL-2.0-only"

PV = "2.1.0"

RPM_NAME = "python39-flake8-builtins-2.1.0-1.3.noarch.rpm"
RPM_HASH = "045275bd0080e4da34ba2277de4fa04934caaac49e60c7b57b0549fd2612eea3dfa0b3a1184ceea569805c223f533a54274efd1211be2a263c68408397ba191c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flake8-builtins) \
python39-flake8-builtins \
python3dist(flake8-builtins)"

RDEPENDS:${PN} += "python(abi) \
python39-flake8"

inherit rpm
