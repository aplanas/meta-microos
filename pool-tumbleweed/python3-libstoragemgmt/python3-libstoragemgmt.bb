SUMMARY = "Python client libraries and plug-in support for libStorageMgmt"
DESCRIPTION = " \
 \
 \
 \
The python-libstoragemgmt package contains python client libraries as \
well as python framework support and open source plug-ins written in python. \
 \
 \
 \
 \
 \
Provides:       python3-libstoragemgmt < 1.9.8-1.2"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.9.8"

RPM_NAME = "python3-libstoragemgmt-1.9.8-1.2.aarch64.rpm"
RPM_HASH = "77bf0c894d70255ccc1dababfaaf0c77375bd713f439e79386fd2373bf0c2f63a662d34df1e8dcc682f58dd790a8bf953a14a048ddf21fe7bf6a27c30e6de098"

RPROVIDES:${PN} += "config-python3-libstoragemgmt \
python3-libstoragemgmt"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstoragemgmt \
libstoragemgmt.so.1 \
python-abi"

inherit rpm
