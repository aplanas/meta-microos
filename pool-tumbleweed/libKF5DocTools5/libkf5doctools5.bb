SUMMARY = "Library to create documentation from DocBook"
DESCRIPTION = "Provides tools to generate documentation in various format from DocBook files."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "5.108.0"

RPM_NAME = "libKF5DocTools5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "ba3190256f6a6f396db6db94cd1a171e39cf89bd50110eb28cefc38b605fba0ab25325f49ce46b6503ee153be809fa3ac499712767d92e77b81d17526600cdca"

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
