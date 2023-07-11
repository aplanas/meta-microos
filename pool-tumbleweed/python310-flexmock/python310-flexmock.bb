SUMMARY = "Testing library for creating mocks, stubs and fakes"
DESCRIPTION = "Flexmock is a testing library for Python for creating mocks, \
stubs and fakes. The API is inspired by a Ruby library of the same name, but \
Python flexmock is not a clone of the Ruby version. It omits a number of \
redundancies in the Ruby flexmock API, alters some defaults, and introduces \
a number of Python-only features."
LICENSE = "BSD-2-Clause"

PV = "0.10.8"

RPM_NAME = "python310-flexmock-0.10.8-2.3.noarch.rpm"
RPM_HASH = "925083019e0c9b5934bd5d5106553ea6e0e7f29138bc497a31f825d89a2269352d50e93a1777593ddc48588005f711c349e226ba9872790040f4c1e565c7627b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flexmock \
python310-flexmock \
python3dist-flexmock"

RDEPENDS:${PN} += "python-abi"

inherit rpm
