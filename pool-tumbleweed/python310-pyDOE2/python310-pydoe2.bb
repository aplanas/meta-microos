SUMMARY = "Design of experiments for Python"
DESCRIPTION = "The pyDOE2 package is a fork of the pyDOE package that is designed to \
help the scientist, engineer, statistician, etc., to construct \
appropriate experimental designs. \
 \
This fork came to life to solve bugs and issues that remained unsolved in the \
original package."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "python310-pyDOE2-1.3.0-2.9.noarch.rpm"
RPM_HASH = "3ce513c80b14800cd0d8f93211a8bb03ffcdcabc8434cc69cfee88a008652ba2e95cd0dd4a241e501cd1dc8fe51c2ebc635ded487559dc800203ae7789a82c16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyDOE2 \
python3.10dist(pydoe2) \
python310-pyDOE2 \
python3dist(pydoe2)"

RDEPENDS:${PN} += "python(abi) \
python310-numpy \
python310-scipy"

inherit rpm
