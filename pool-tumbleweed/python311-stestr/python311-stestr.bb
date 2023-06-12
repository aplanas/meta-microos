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

PV = "3.2.1"

RPM_NAME = "python311-stestr-3.2.1-2.3.noarch.rpm"
RPM_HASH = "36ca354a37c4ba4a406b014adcb276776b9d0ef8f2c63c7bf44c9748c12563bec439f319cd753628c0575612c267e7c57a07ff0db3ed9570e04ff21a069a1772"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(stestr) \
python311-stestr \
python3dist(stestr)"
RDEPENDS:${PN} += "python(abi) \
python311-PyYAML \
python311-fixtures \
python311-future \
python311-pbr \
python311-python-subunit \
python311-testtools \
python311-voluptuous"

inherit rpm
