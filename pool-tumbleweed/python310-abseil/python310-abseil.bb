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

RPM_NAME = "python310-abseil-1.4.0-1.2.noarch.rpm"
RPM_HASH = "f6c2b319bc08ca319dd3134b1171b8a1773753e7f8f6235d6627931f4a73147d2d0b3f17b81257d0be03dc43f0b70fbee087ab560ee8c92d89761d5febfc8a36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-absl-py \
python310-abseil \
python310-absl-py \
python3dist-absl-py"

RDEPENDS:${PN} += "python-abi"

inherit rpm
