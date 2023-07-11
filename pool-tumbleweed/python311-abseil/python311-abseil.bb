SUMMARY = "Abseil Python Common Libraries"
DESCRIPTION = "This package is a collection of Python library code for building Python \
applications. The code is collected from Google's own Python code base, and has \
been extensively tested and used in production. \
* Simple application startup \
* Distributed commandline flags system \
* Custom logging module with additional features \
* Testing utilities"
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "python311-abseil-1.4.0-1.2.noarch.rpm"
RPM_HASH = "b2f6c6ba3020cf1ad527671b3878cd505cee84defb682b43bc63df8abc4d85477bb8578c28733150108e5bd4f0a0d22e5f57a99a631b3531f9d95d2d8eeecb40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-abseil \
python3-absl-py \
python3.11dist-absl-py \
python311-abseil \
python311-absl-py \
python3dist-absl-py"

RDEPENDS:${PN} += "python-abi"

inherit rpm
