SUMMARY = "Library to create documentation from DocBook"
DESCRIPTION = "Provides tools to generate documentation in various format from DocBook files."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "5.107.0"

RPM_NAME = "libKF5DocTools5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "2eedbac8db3a11fa6525dae1376c5f587913cdeba537c66645a2f6e7882c2146885009f1665e7e66f9a0080dce1678447020f1ec9f477b06349b47d76a8b19f7"

RPROVIDES:${PN} += "libKF5DocTools.so.5 \
libKF5DocTools5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libQt5Core.so.5 \
libQt5Core5 \
libc.so.6 \
libstdc++.so.6 \
libxml2.so.2 \
libxslt.so.1"

inherit rpm
