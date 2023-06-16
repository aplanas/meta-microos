SUMMARY = "Lightweight Monitor Config Tool"
DESCRIPTION = "LXRandR is a lightweight Monitor Config Tool"
LICENSE = "GPL-2.0-only"

PV = "0.3.2"

RPM_NAME = "lxrandr-0.3.2-1.14.aarch64.rpm"
RPM_HASH = "bb3de0e939e70c9553e0f76741d52c416ccf028391d3b61b2a71d2c95870357542c899f2ccae5d854fc75b966295a537bbf1482fec8668e00f866578aa3877d6"

RPROVIDES:${PN} += "lxrandr"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
