SUMMARY = "Console mouse support library"
DESCRIPTION = "This package provides a library that handles mouse requests and \
delivers them to applications. See the description for the 'gpm' \
package for more information."
LICENSE = "GPL-2.0-or-later"

PV = "1.20.7"

RPM_NAME = "libgpm2-1.20.7-19.14.aarch64.rpm"
RPM_HASH = "12aa8d20f696b6eaad7cde32e55e12a7055e35ccfb404b73b56c3a9dfeba16b5e90481b592e335fd1ae1df052f5756fbaf8b9f25ba9d2fe73d0df884bbb04357"

RPROVIDES:${PN} += "libgpm.so.2()(64bit) \
libgpm2 \
libgpm2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
