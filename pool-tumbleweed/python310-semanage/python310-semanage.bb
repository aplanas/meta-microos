SUMMARY = "Python bindings for SELinux's policy management library"
DESCRIPTION = "This package contains the Python bindings for developing \
SELinux policy management applications."
LICENSE = "LGPL-2.1-only"

PV = "3.5"

RPM_NAME = "python310-semanage-3.5-1.9.aarch64.rpm"
RPM_HASH = "77bd797376fdb8a84a9ffa492d0e3d2c5a6985b24aa1a65bc93e9e7bac086c5603726427e202a55967a2343e73c99d57de7e358af3b52788f696193e1e4ad9ac"

RPROVIDES:${PN} += "python310-semanage"

RDEPENDS:${PN} += "libc.so.6 \
libsemanage.so.2 \
libsemanage2 \
python-abi"

inherit rpm
