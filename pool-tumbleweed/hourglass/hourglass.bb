SUMMARY = "Clock gadget for Elementary OS"
DESCRIPTION = "A clock application that is designed to fit perfectly into \
Elementary's design scheme."
LICENSE = "GPL-3.0-only"

PV = "2.0.2"

RPM_NAME = "hourglass-2.0.2-1.11.aarch64.rpm"
RPM_HASH = "e23734f69550e86ab43388805fc66c99076ff817dea7bdc68f242775fcde07bc8cd5062f654fc2cda103e295e10a0f5346d1907fb7764cd8dafc6cdfd33150a1"

RPROVIDES:${PN} += "hourglass"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libhandy-1.so.0"

inherit rpm
