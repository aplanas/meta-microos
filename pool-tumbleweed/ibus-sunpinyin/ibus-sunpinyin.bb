SUMMARY = "Sunpinyin module for ibus"
DESCRIPTION = "ibus-sunpinyin is a wrapper around SunPinyin which enables user to use \
SunPinyin with IBus framework."
LICENSE = "CDDL-1.0 | LGPL-2.1-only"

PV = "2.0.99.2"

RPM_NAME = "ibus-sunpinyin-2.0.99.2-3.8.aarch64.rpm"
RPM_HASH = "467e43e7d3ff2e10de6255dbcc96395f2d139c1ae157542329cfc797e5c7e7b578125cb883d3d2343af69fb684d3ffbc7d092ec45fe5629a676360511c2baea1"

RPROVIDES:${PN} += "ibus-sunpinyin"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libibus-1.0.so.5 \
libstdc++.so.6 \
libsunpinyin.so.3 \
sunpinyin-data"

inherit rpm
