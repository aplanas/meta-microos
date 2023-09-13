SUMMARY = "A parallel Python test runner built around subunit"
DESCRIPTION = "stestr is parallel Python test runner designed to execute unittest test suites \
using multiple processes to split up execution of a test suite. It also will \
store a history of all test runs to help in debugging failures and optimizing \
the scheduler to improve speed. To accomplish this goal it uses the subunit \
protocol to facilitate streaming and storing results from multiple workers. \
 \
stestr originally started as a fork of the testrepository project. But, instead \
of being an interface for any test runner that used subunit, like testrepository, \
stestr concentrated on being a dedicated test runner for python projects. While \
stestr was originally forked from testrepository it is not backwards compatible \
with testrepository. At a high level the basic concepts of operation are shared \
between the two projects but the actual usage is not exactly the same."
LICENSE = "Apache-2.0"

PV = "4.0.1"

RPM_NAME = "python39-stestr-4.0.1-1.1.noarch.rpm"
RPM_HASH = "b2b84f97d95e80c02dc0a29e4e16490da6fdc27d343c2082a8f7825ff2e817797ab70b643d17d784c33670910ece84b329ce196098a32bfc32fc4c12e429800e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-stestr \
python39-stestr \
python3dist-stestr"

RDEPENDS:${PN} += "python-abi \
python39-PyYAML \
python39-fixtures \
python39-pbr \
python39-python-subunit \
python39-testtools \
python39-voluptuous"

inherit rpm
