SUMMARY = "Integration tests for libstorage-ng"
DESCRIPTION = "This package contains integration tests for libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.136"

RPM_NAME = "libstorage-ng-integration-tests-4.5.136-1.1.noarch.rpm"
RPM_HASH = "430404e473724521198cb38db4524db266d9c57065ea3d0a2af415f8a7d6f49f5120705fb0c133f38e9ac6316bdf3fa932c722f95ff2b9855d85c7d2154d80c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libstorage-ng-integration-tests"

RDEPENDS:${PN} += "/usr/bin/python3 \
libstorage-ng-python3 \
python-abi"

inherit rpm
