SUMMARY = "Multithreaded Programming Language"
DESCRIPTION = "Qore is a scripting language supporting threading and embedded logic. \
It applies a scripting-based approach to interface development and \
can also be used as a general purpose language."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later | MIT"

PV = "1.18.1"

RPM_NAME = "qore-1.18.1-1.1.aarch64.rpm"
RPM_HASH = "8cacca4a0a5f2abc8447c3a919dca059ec51a3049afcd82c8e01fc7932e34c21a8f4547984f89a4b283db0d6456be740a02c8f1049e0ddce938b98760b2adcb6"

RPROVIDES:${PN} += "qore"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libqore.so.12 \
libstdc++.so.6 \
shared-mime-info"

inherit rpm
