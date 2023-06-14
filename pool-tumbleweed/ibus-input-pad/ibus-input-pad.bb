SUMMARY = "Input Pad for IBus"
DESCRIPTION = "The input pad engine for IBus platform."
LICENSE = "GPL-2.0+"

PV = "1.4.99.20140916"

RPM_NAME = "ibus-input-pad-1.4.99.20140916-1.30.aarch64.rpm"
RPM_HASH = "58d55064f061f26fe80aedad0706e7210e12abe1e60b257f7dc8aba5d58ea8452aeb1a2c242f8b16cb02473caf1f54c20526f90a2b322833b2c5bd7eeb605483"

RPROVIDES:${PN} += "ibus-input-pad"

RDEPENDS:${PN} += "ibus \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libibus-1.0.so.5 \
libinput-pad-1.0.so.1"

inherit rpm
