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

RPM_NAME = "python311-abseil-1.4.0-1.1.noarch.rpm"
RPM_HASH = "f13be54fd80c45e4eb1877a05d42205bad0bc4289369b6944c5e3454ac3a6ff6bc47cd5624e7bc4168abd861dd414a9374718080035f9f94b895288124072ad8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-absl-py \
python311-abseil \
python311-absl-py \
python3dist-absl-py"

RDEPENDS:${PN} += "python-abi"

inherit rpm
