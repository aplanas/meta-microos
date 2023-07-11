SUMMARY = "Qt 5 NetworkAuth Library"
DESCRIPTION = "Qt Network Authorization provides a set of APIs that enable Qt \
applications to obtain limited access to online accounts and HTTP \
services without exposing users' passwords. It supports OAuth \
versions 1 and 2."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.10+kde0"

RPM_NAME = "libQt5NetworkAuth5-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "1642a72807c1aff2b377e0c85c5fe76719aa205eeab0dbcb7b2788d0b8bbefbf5d73371c129213208c9e215252635b7a952ed26e262ea2ad2e664b9d5c0a42d5"

RPROVIDES:${PN} += "libQt5NetworkAuth.so.5 \
libQt5NetworkAuth5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Network.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
