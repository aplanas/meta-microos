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

RPM_NAME = "python310-abseil-1.4.0-1.1.noarch.rpm"
RPM_HASH = "26bb96308b8b10f863da3c49696c67693c529bf13d5b3c7c659fa5cda7944e9855018a31b9d0bd3c320ad24305e55494be5043e046adce16d0db93a78d7024eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-abseil \
python3-absl-py \
python3.10dist(absl-py) \
python310-abseil \
python310-absl-py \
python3dist(absl-py)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
