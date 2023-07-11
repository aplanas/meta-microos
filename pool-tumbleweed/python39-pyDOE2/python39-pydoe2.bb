SUMMARY = "Design of experiments for Python"
DESCRIPTION = "The pyDOE2 package is a fork of the pyDOE package that is designed to \
help the scientist, engineer, statistician, etc., to construct \
appropriate experimental designs. \
 \
This fork came to life to solve bugs and issues that remained unsolved in the \
original package."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "python39-pyDOE2-1.3.0-2.11.noarch.rpm"
RPM_HASH = "e7028858815e07ece96b318988594e226cf699af9b897aaea6590b20442b45fadc7ff1cee3bf78e93f61ce993ec1484ac807328e64dc045283e6ee28f3f3eb8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pydoe2 \
python39-pyDOE2 \
python3dist-pydoe2"

RDEPENDS:${PN} += "python-abi \
python39-numpy \
python39-scipy"

inherit rpm
