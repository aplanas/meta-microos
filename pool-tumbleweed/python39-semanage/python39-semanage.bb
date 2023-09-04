SUMMARY = "Python bindings for SELinux's policy management library"
DESCRIPTION = "This package contains the Python bindings for developing \
SELinux policy management applications."
LICENSE = "LGPL-2.1-only"

PV = "3.5"

RPM_NAME = "python39-semanage-3.5-2.1.aarch64.rpm"
RPM_HASH = "f9206df9c11788fc548720b81ccf76a0d6e2bf8d39f6b17fd90aae0de7794a0efedb32587e65551fbf22a05c72330bd25543f89b1cdc7d88538cd37652f336b8"

RPROVIDES:${PN} += "python39-semanage"

RDEPENDS:${PN} += "libc.so.6 \
libsemanage.so.2 \
libsemanage2 \
python-abi"

inherit rpm
