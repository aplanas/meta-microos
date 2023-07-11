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

RPM_NAME = "python39-abseil-1.4.0-1.2.noarch.rpm"
RPM_HASH = "8b28fd83171d4a018485637ff7647344cdc818cc7f1095f57a8d89b5d01cb778dc4dcc9126b70f09f12a86ab97bf308aa2a18644747f9ab0824d3283ced894fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-absl-py \
python39-abseil \
python39-absl-py \
python3dist-absl-py"

RDEPENDS:${PN} += "python-abi"

inherit rpm
