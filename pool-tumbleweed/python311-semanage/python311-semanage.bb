SUMMARY = "Python bindings for SELinux's policy management library"
DESCRIPTION = "This package contains the Python bindings for developing \
SELinux policy management applications."
LICENSE = "LGPL-2.1-only"

PV = "3.5"

RPM_NAME = "python311-semanage-3.5-1.9.aarch64.rpm"
RPM_HASH = "72208bbfade27ec5b6579ec91ea1f531d2e1b5f6ea07985758505425baf6e84508d8ef129c307f3ac56ee4809230d4fb27311f26b1e2ad9170f6f12465d4ab04"

RPROVIDES:${PN} += "python3-semanage \
python311-semanage"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsemanage.so.2 \
libsemanage2 \
python-abi"

inherit rpm
