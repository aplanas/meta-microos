SUMMARY = "omniORB thread library"
DESCRIPTION = "Thread support library for omniORB."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.3.0"

RPM_NAME = "libomnithread4-4.3.0-2.8.aarch64.rpm"
RPM_HASH = "804969f085b740ff01cb4e93c3df14f7b820d6b432300b6a99eabcde6e542071846a4883dc30aa08cbc6c318f2d36102f78ba13d022bb744fde7ad627146112a"

RPROVIDES:${PN} += "libomnithread.so.4 \
libomnithread4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
