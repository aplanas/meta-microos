SUMMARY = "Testing library for creating mocks, stubs and fakes"
DESCRIPTION = "Flexmock is a testing library for Python for creating mocks, \
stubs and fakes. The API is inspired by a Ruby library of the same name, but \
Python flexmock is not a clone of the Ruby version. It omits a number of \
redundancies in the Ruby flexmock API, alters some defaults, and introduces \
a number of Python-only features."
LICENSE = "BSD-2-Clause"

PV = "0.10.8"

RPM_NAME = "python39-flexmock-0.10.8-2.3.noarch.rpm"
RPM_HASH = "f8a4b0519e362fb6a984447ddb17cf21edd0dccb4cd643626df7c4b5506b784392652023d08ee632b8a99f4b771c703b91af223f2254ba782a34ed98aef68f6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flexmock \
python39-flexmock \
python3dist-flexmock"

RDEPENDS:${PN} += "python-abi"

inherit rpm
