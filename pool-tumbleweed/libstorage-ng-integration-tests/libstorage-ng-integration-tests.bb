SUMMARY = "Integration tests for libstorage-ng"
DESCRIPTION = "This package contains integration tests for libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.127"

RPM_NAME = "libstorage-ng-integration-tests-4.5.127-1.1.noarch.rpm"
RPM_HASH = "98652df63b3b02a183e6803b0036b5724a7926b382b3e049daad7a0c8f5f15a109d6d3911912bda5f1254291fbfbdda10936a194261a88ed66c24291002d3f01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libstorage-ng-integration-tests"

RDEPENDS:${PN} += "/usr/bin/python3 \
libstorage-ng-python3 \
python-abi"

inherit rpm
