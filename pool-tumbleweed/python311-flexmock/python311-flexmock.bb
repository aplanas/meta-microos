SUMMARY = "Testing library for creating mocks, stubs and fakes"
DESCRIPTION = "Flexmock is a testing library for Python for creating mocks, \
stubs and fakes. The API is inspired by a Ruby library of the same name, but \
Python flexmock is not a clone of the Ruby version. It omits a number of \
redundancies in the Ruby flexmock API, alters some defaults, and introduces \
a number of Python-only features."
LICENSE = "BSD-2-Clause"

PV = "0.10.8"

RPM_NAME = "python311-flexmock-0.10.8-2.3.noarch.rpm"
RPM_HASH = "cf0d17215abeb0a0c4c04692c1d42674aab5e5bead8a6ba929cc78059663d74c2ad4769fd0c8cff5ce2ff1fd185e0fae7752d11cf469c56ecb8577ea999eaa8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flexmock \
python3.11dist-flexmock \
python311-flexmock \
python3dist-flexmock"

RDEPENDS:${PN} += "python-abi"

inherit rpm
