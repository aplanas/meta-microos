SUMMARY = "Python bindings for SELinux's policy management library"
DESCRIPTION = "This package contains the Python bindings for developing \
SELinux policy management applications."
LICENSE = "LGPL-2.1-only"

PV = "3.5"

RPM_NAME = "python311-semanage-3.5-2.1.aarch64.rpm"
RPM_HASH = "009f9f40d85b4e36b25acc575aed5d1a079dd181c37cb1d184a91079dbca2bf6812829299d6a9b48111e2da4ded3e092e54c1b5af5af6ecb80434f95aec96c4c"

RPROVIDES:${PN} += "python3-semanage \
python311-semanage"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsemanage.so.2 \
libsemanage2 \
python-abi"

inherit rpm
