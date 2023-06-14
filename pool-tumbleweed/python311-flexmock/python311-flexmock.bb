SUMMARY = "Testing library for creating mocks, stubs and fakes"
DESCRIPTION = "Flexmock is a testing library for Python for creating mocks, \
stubs and fakes. The API is inspired by a Ruby library of the same name, but \
Python flexmock is not a clone of the Ruby version. It omits a number of \
redundancies in the Ruby flexmock API, alters some defaults, and introduces \
a number of Python-only features."
LICENSE = "BSD-2-Clause"

PV = "0.10.8"

RPM_NAME = "python311-flexmock-0.10.8-2.1.noarch.rpm"
RPM_HASH = "344406484667f361df8066ef1aea3519001c6d5b53ad757cc65de37471176a329e3afe6542b6ef2a3d62c9d0801eafcf5d2dcb66d57e3b740827085a72901437"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-flexmock \
python311-flexmock \
python3dist-flexmock"

RDEPENDS:${PN} += "python-abi"

inherit rpm
