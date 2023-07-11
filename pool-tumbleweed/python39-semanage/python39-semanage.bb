SUMMARY = "Python bindings for SELinux's policy management library"
DESCRIPTION = "This package contains the Python bindings for developing \
SELinux policy management applications."
LICENSE = "LGPL-2.1-only"

PV = "3.5"

RPM_NAME = "python39-semanage-3.5-1.9.aarch64.rpm"
RPM_HASH = "3aba4b7e5536a994a2641a9fb2d0c154c550fa93e68a688f089e0a9ade85fab9cbcf4d79e824f41f2fa13338656f392f1ec9a133f7d7b2c439a2594ab75e450a"

RPROVIDES:${PN} += "python39-semanage"

RDEPENDS:${PN} += "libc.so.6 \
libsemanage.so.2 \
libsemanage2 \
python-abi"

inherit rpm
