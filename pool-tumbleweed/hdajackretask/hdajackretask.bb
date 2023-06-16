SUMMARY = "HD-audio jack retasking tool"
DESCRIPTION = "hdajackretask is a GUI tool to make it easy to retask HD-audio jacks."
LICENSE = "GPL-2.0-or-later"

PV = "0.20120413"

RPM_NAME = "hdajackretask-0.20120413-24.3.aarch64.rpm"
RPM_HASH = "3aa7b1659ee389c0629989d8f7e2c4d226d53f7a75a0fabc89a5c518e9b495e8a87a45ef37e88a2ac40b7107856af0a1478c32f480b1a8039245544ffe820041"

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
