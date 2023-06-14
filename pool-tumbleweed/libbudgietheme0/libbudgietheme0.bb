SUMMARY = "Shared library for Budgie theming"
DESCRIPTION = "Budgie theming engine shared library package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.7.2+0"

RPM_NAME = "libbudgietheme0-10.7.2+0-1.1.aarch64.rpm"
RPM_HASH = "3135942d99dbaf3b509892ffc80b5d30e1816c6902bc04636fa9d27328330dae8c4e95721123572fcb0afaeb44d964371bac5a7459393ae16241bc70ada06726"

RPROVIDES:${PN} += "libbudgietheme.so.0 \
libbudgietheme0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
