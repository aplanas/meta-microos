SUMMARY = "An Accessibility Toolkit"
DESCRIPTION = "The ATK library provides a set of accessibility interfaces. By \
supporting the ATK interfaces, an application or toolkit can be used \
with screen readers, magnifiers, and alternate input devices."
LICENSE = "LGPL-2.1-or-later"

PV = "2.48.3"

RPM_NAME = "libatk-1_0-0-2.48.3-2.1.aarch64.rpm"
RPM_HASH = "bb6b1585962129819ba614104116b34b204697af436fde255fdcc884ed23b3cf93b021567803c090c86d55d84298acbf1ff13eb0541e08c9c9ffdde590b3efcd"

RPROVIDES:${PN} += "atk \
libatk-1-0-0 \
libatk-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
