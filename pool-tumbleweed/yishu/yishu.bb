SUMMARY = "A bespoke and simple Todo.txt client"
DESCRIPTION = "Write a to-do list that will be easy to sync with most known Todo.txt clients."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.5"

RPM_NAME = "yishu-1.2.5-1.16.aarch64.rpm"
RPM_HASH = "6332dce1dff8ca8ce95702a26a2c912199953f0526f169293a75bcbc539fb3bbeee14bc4bc13b96a18664f8f1f1c8621bd7f2b430c8a9d21f08250447a1272c6"

RPROVIDES:${PN} += "yishu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0"

inherit rpm
