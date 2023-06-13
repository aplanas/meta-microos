SUMMARY = "Enhancements to distutils for building and distributing Python packages"
DESCRIPTION = "setuptools is a collection of enhancements to the Python distutils that \
allow you to build and distribute Python packages, \
especially ones that have dependencies on other packages."
LICENSE = "MIT"

PV = "44.0.0"

RPM_NAME = "python2-setuptools-44.0.0-3.7.noarch.rpm"
RPM_HASH = "558ce8321654ac8ac0f44d10e05263736ec0a522a50a1180ce5a50046c98811eb2c1845bafce01afc48f2d0806850e512717ddb34e1ea8ed5f0b759320a546d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-distribute \
python2-setuptools"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python2 \
python2 \
python2-base \
update-alternatives"

inherit rpm
