SUMMARY = "A program for looking up data of elements from the periodic table"
DESCRIPTION = "GPeriodic is a program for looking up data of elements from the \
periodic table. This program also features a non-graphical interface."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.3"

RPM_NAME = "gperiodic-3.0.3-2.12.aarch64.rpm"
RPM_HASH = "dc9070d6d64c096c70618c80ef21d67d804299dea3fffd015deeb93a03f00ed6a155dd6db977fac67c2454543c27e567d19adfb2ddb1444e7a866632107e27c6"

RPROVIDES:${PN} += "gperiodic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0"

inherit rpm
