SUMMARY = "Integration tests for libstorage-ng"
DESCRIPTION = "This package contains integration tests for libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.115"

RPM_NAME = "libstorage-ng-integration-tests-4.5.115-1.1.noarch.rpm"
RPM_HASH = "fc37c7b1f9bb416c85cbb0d449b269b84c159b7c191f4bc78260badb7e5b979d742f460c3924f64bb6179c1f9e061a0b5a99b0a013e674d439424adf9329c702"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libstorage-ng-integration-tests"

RDEPENDS:${PN} += "/usr/bin/python3 \
libstorage-ng-python3 \
python-abi"

inherit rpm
