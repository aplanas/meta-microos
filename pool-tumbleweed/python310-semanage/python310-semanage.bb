SUMMARY = "Python bindings for SELinux's policy management library"
DESCRIPTION = "This package contains the Python bindings for developing \
SELinux policy management applications."
LICENSE = "LGPL-2.1-only"

PV = "3.5"

RPM_NAME = "python310-semanage-3.5-2.1.aarch64.rpm"
RPM_HASH = "2e82f9018107a9835b7ebdd947a104691659cf4078dc601dca605631dd2235aab48f729fc0d6ee72e66f5a3b41ec24054e462827a396e66bd4c3919777828f0b"

RPROVIDES:${PN} += "python310-semanage"

RDEPENDS:${PN} += "libc.so.6 \
libsemanage.so.2 \
libsemanage2 \
python-abi"

inherit rpm
