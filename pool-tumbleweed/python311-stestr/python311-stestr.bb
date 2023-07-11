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

RPM_NAME = "python311-stestr-3.2.1-2.4.noarch.rpm"
RPM_HASH = "ec96a5487ffc820eceb7214b4b0363fac76dd6026b0756d7fcf07e48260ab0e6ef9d2d82a165259d0495c3f3776c3a4245c581e015e25724b9f1d4ff0bdd54cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-stestr \
python3.11dist-stestr \
python311-stestr \
python3dist-stestr"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
python-abi \
python3-cliff \
python311-PyYAML \
python311-dbm \
python311-fixtures \
python311-future \
python311-pbr \
python311-python-subunit \
python311-testtools \
python311-voluptuous"

inherit rpm
