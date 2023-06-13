SUMMARY = "An Accessibility Toolkit"
DESCRIPTION = "The ATK library provides a set of accessibility interfaces. By \
supporting the ATK interfaces, an application or toolkit can be used \
with screen readers, magnifiers, and alternate input devices."
LICENSE = "LGPL-2.1-or-later"

PV = "2.48.3"

RPM_NAME = "libatk-1_0-0-2.48.3-1.1.aarch64.rpm"
RPM_HASH = "16002eecdb78ab50d6d7f281e55b80536f9eff739c0991bf5410c43c66616d264bc14dcc3752013ee6622dba26ea5a67c057cedbfc5065244766ae715a3f28c7"

RPROVIDES:${PN} += "atk \
libatk-1.0.so.0()(64bit) \
libatk-1_0-0 \
libatk-1_0-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
