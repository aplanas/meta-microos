SUMMARY = "Python bindings for SELinux's policy management library"
DESCRIPTION = "This package contains the Python bindings for developing \
SELinux policy management applications."
LICENSE = "LGPL-2.1-only"

PV = "3.5"

RPM_NAME = "python39-semanage-3.5-1.4.aarch64.rpm"
RPM_HASH = "c778c4047203619f855472ea13b3623bd463f891c1aa3aa9eb0c96e756fea66b4c7cc89474d72e40cd11d9896cea48dcecbf7d2fdd58f58641cfa9aa9ccabad5"

RPROVIDES:${PN} += "python39-semanage \
python39-semanage(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
libsemanage.so.2()(64bit) \
libsemanage.so.2(LIBSEMANAGE_1.0)(64bit) \
libsemanage.so.2(LIBSEMANAGE_1.1)(64bit) \
libsemanage.so.2(LIBSEMANAGE_3.4)(64bit) \
libsemanage2 \
python(abi)"

inherit rpm
