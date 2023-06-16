SUMMARY = "Sunpinyin module for ibus"
DESCRIPTION = "ibus-sunpinyin is a wrapper around SunPinyin which enables user to use \
SunPinyin with IBus framework."
LICENSE = "CDDL-1.0 | LGPL-2.1-only"

PV = "2.0.99.2"

RPM_NAME = "ibus-sunpinyin-2.0.99.2-3.7.aarch64.rpm"
RPM_HASH = "be2eafeae5c77d12227026d77bf8dd8bd4e7cd54c713377188f265344e5b9d1bb5fd26784cddf62b24aa7ea1a9a7011b56bd5dfbaf2cec0644b31fdaad9b693c"

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
