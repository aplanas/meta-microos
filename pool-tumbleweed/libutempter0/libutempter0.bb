SUMMARY = "Shared library of utempter"
DESCRIPTION = "Utempter is a privileged helper for utmp and wtmp updates.  This \
package contains the library used by applications."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.1"

RPM_NAME = "libutempter0-1.2.1-1.3.aarch64.rpm"
RPM_HASH = "665dfea47bd1eed8751470d595809c41c9f8b0fbe3510f724508854c67d97485817c86a531e26f2a98052f6eade1ca857bec343ef526ef9da9855cfb8d91552c"

RPROVIDES:${PN} += "libutempter.so.0 \
libutempter0 \
utempter"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
group-utmp \
ld-linux-aarch64.so.1 \
libc.so.6 \
permissions"

inherit rpm
