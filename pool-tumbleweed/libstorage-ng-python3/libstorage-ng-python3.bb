SUMMARY = "Python bindings for libstorage-ng"
DESCRIPTION = "This package contains Python bindings for libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.127"

RPM_NAME = "libstorage-ng-python3-4.5.127-1.1.aarch64.rpm"
RPM_HASH = "dedf73c5097f93237aa28a2260821d68f617bb0d5deb73727345c759f10567d5585dedd2105193d15ecc60c5a6497c49f56d8aaef6e67f91de74a5ae27e95f09"

RPROVIDES:${PN} += "libstorage-ng-python3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libstorage-ng.so.1 \
libstorage-ng1 \
python-abi"

inherit rpm
