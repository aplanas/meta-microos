SUMMARY = "An Accessibility Toolkit"
DESCRIPTION = "The ATK library provides a set of accessibility interfaces. By \
supporting the ATK interfaces, an application or toolkit can be used \
with screen readers, magnifiers, and alternate input devices."
LICENSE = "LGPL-2.1-or-later"

PV = "2.48.4"

RPM_NAME = "libatk-1_0-0-2.48.4-1.1.aarch64.rpm"
RPM_HASH = "b2459303478a659db01ef43e0b420a8df36d84e14af2b2b7e439083d8ae268ff4c8f44be911be5a410387013ea85f0953ae6c29b559cb9deb633eabd9ae3cb6d"

RPROVIDES:${PN} += "atk \
libatk-1-0-0 \
libatk-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
