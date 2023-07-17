SUMMARY = "Integration tests for libstorage-ng"
DESCRIPTION = "This package contains integration tests for libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.123"

RPM_NAME = "libstorage-ng-integration-tests-4.5.123-1.1.noarch.rpm"
RPM_HASH = "da83f194c239987cbe7cd1b1171c4f2dacc0669ea1d1f0e7f7763195cadbf5cfef8ba55d296c7080cff4e4e89d6b3a8cfbcc46442375da7d1de85cb983b8f4e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libstorage-ng-integration-tests"

RDEPENDS:${PN} += "/usr/bin/python3 \
libstorage-ng-python3 \
python-abi"

inherit rpm
