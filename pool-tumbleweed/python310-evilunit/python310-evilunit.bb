SUMMARY = "Python unittest helpers"
DESCRIPTION = "evilunit provides helpers for Python unittest, \
including class level imports, parameterized tests \
and nested test classes."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python310-evilunit-0.2.1-1.12.noarch.rpm"
RPM_HASH = "c4b8aaadbd9ce1718e93fdfcbb72d0ddac5fd465d8a704b4a210de8d0862d16e58791f71e20f3680f34e19d616b8eda356619ea952bf13c01089d376766bbab2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-evilunit \
python3.10dist(evilunit) \
python310-evilunit \
python3dist(evilunit)"

RDEPENDS:${PN} += "python(abi) \
python310-setuptools"

inherit rpm
