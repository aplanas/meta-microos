SUMMARY = "Testing library for creating mocks, stubs and fakes"
DESCRIPTION = "Flexmock is a testing library for Python for creating mocks, \
stubs and fakes. The API is inspired by a Ruby library of the same name, but \
Python flexmock is not a clone of the Ruby version. It omits a number of \
redundancies in the Ruby flexmock API, alters some defaults, and introduces \
a number of Python-only features."
LICENSE = "BSD-2-Clause"

PV = "0.10.8"

RPM_NAME = "python39-flexmock-0.10.8-2.1.noarch.rpm"
RPM_HASH = "dca3889b4c6e2664aac07895e470a0a12a43ec64e300b22af2f8e42a408ddbbea4b527e88a13d6afc43b0bf852a60fa139bdd4a2d3939fc1509137f12501158d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flexmock) \
python39-flexmock \
python3dist(flexmock)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
