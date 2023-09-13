SUMMARY = "Integration tests for libstorage-ng"
DESCRIPTION = "This package contains integration tests for libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.141"

RPM_NAME = "libstorage-ng-integration-tests-4.5.141-1.1.noarch.rpm"
RPM_HASH = "3d3cd87f67e75a4a7496a1e7d15617669f336508438830efce69d97c4651e175bfb613d8c3bbe12c2db507c9c9210cff50906302ab3d801ccea9b207a8647cad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libstorage-ng-integration-tests"

RDEPENDS:${PN} += "/usr/bin/python3 \
libstorage-ng-python3 \
python-abi"

inherit rpm
