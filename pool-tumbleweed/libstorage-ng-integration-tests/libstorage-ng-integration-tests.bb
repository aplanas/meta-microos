SUMMARY = "Integration tests for libstorage-ng"
DESCRIPTION = "This package contains integration tests for libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.122"

RPM_NAME = "libstorage-ng-integration-tests-4.5.122-1.1.noarch.rpm"
RPM_HASH = "8152704807344831664193f48132f106e27cf95d57f7f2112ea7e5c70465e7f8340f99cd7f085fd7611c4aa56539b92e6460b0efcce771014640907cc345b1ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libstorage-ng-integration-tests"

RDEPENDS:${PN} += "/usr/bin/python3 \
libstorage-ng-python3 \
python-abi"

inherit rpm
