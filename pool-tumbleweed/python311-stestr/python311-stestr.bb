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

RPM_NAME = "python311-stestr-4.0.1-1.1.noarch.rpm"
RPM_HASH = "c479f1a98511568f1bb9e1ab90465d1f8dcbf571e5c5877d290ce92e487a0a67d81b29a63896c18e1a15daf0c11f5c11cfa304c0cdaaf8f8a595321ebd575ce1"
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
python311-pbr \
python311-python-subunit \
python311-testtools \
python311-voluptuous"

inherit rpm
