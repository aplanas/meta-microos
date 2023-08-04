SUMMARY = "Integration tests for libstorage-ng"
DESCRIPTION = "This package contains integration tests for libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.133"

RPM_NAME = "libstorage-ng-integration-tests-4.5.133-1.1.noarch.rpm"
RPM_HASH = "7c13174a6046e6a61fcec108e930c435fb591e8457c4acabc5eecdf2f48b0c29936ed97fa1aa850eaba9b2141074f4721c13d392e60fcd9de83725f2f2fba005"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libstorage-ng-integration-tests"

RDEPENDS:${PN} += "/usr/bin/python3 \
libstorage-ng-python3 \
python-abi"

inherit rpm
