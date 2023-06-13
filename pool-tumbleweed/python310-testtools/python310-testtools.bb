SUMMARY = "Extensions to the Python Standard Library Unit Testing Framework"
DESCRIPTION = "testtools is a set of extensions to the Python standard library's unit tests \
framework. These extensions have been derived from many years of experience \
with unit tests in Python and come from many different sources. testtools \
also ports recent unittest changes all the way back to Python 2.4."
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "python310-testtools-2.6.0-1.1.noarch.rpm"
RPM_HASH = "a7f7edc43c2146e0f8cd7b9a71cf51f424372cad16e24cabdf56385a2f3fa34a5b5d7cb8dd480e62a71a7972dda6b257c4662954275ba827bf761f64afbb6488"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-testtools \
python3.10dist(testtools) \
python310-testtools \
python3dist(testtools)"

RDEPENDS:${PN} += "python(abi) \
python310-pbr \
python310-python-mimeparse \
python310-traceback2"

inherit rpm
