SUMMARY = "HD-audio jack retasking tool"
DESCRIPTION = "hdajackretask is a GUI tool to make it easy to retask HD-audio jacks."
LICENSE = "GPL-2.0-or-later"

PV = "0.20120413"

RPM_NAME = "hdajackretask-0.20120413-24.4.aarch64.rpm"
RPM_HASH = "21576693241e9bf4c8a8856a6b96700d88c1b2fc6d0d122f429ee6d5c4f0d7cb409812ac53598951890bd6a4b214bc963b8747b8bd7db6326ad2ce18c9dff2f5"

RPROVIDES:${PN} += "alsa-tools-gui-/usr/bin/hdajackretask \
hdajackretask"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
