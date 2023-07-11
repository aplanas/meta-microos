SUMMARY = "Library containing basic objects like dynamic string"
DESCRIPTION = "A small library that provides a buffer object."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.1"

RPM_NAME = "libbasicobjects0-0.1.1-28.1.aarch64.rpm"
RPM_HASH = "806b980ae4c7d766fe66bbb2de245be36d4797cdc5719fc331a894e7128c084f24956aa726b3f1d00aefd677470197b766d11f5d42348a5db62ca04d5a8c8862"

RPROVIDES:${PN} += "libbasicobjects.so.0 \
libbasicobjects0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
