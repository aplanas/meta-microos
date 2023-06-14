SUMMARY = "Simple PDF comparison tool"
DESCRIPTION = "diff-pdf is a simple tool for comparing two PDF files."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "0.5"

RPM_NAME = "diff-pdf-0.5-2.4.aarch64.rpm"
RPM_HASH = "59f0e2cc6d306f5bf2113a9f2b647aaa0bef9f3faa6fc241ec9072de4812de3b7cc2591d99720e01be65d028c95dfc5ef74d97de6ee0ceaec3f8d83e661fa422"

RPROVIDES:${PN} += "diff-pdf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpoppler-glib.so.8 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk2u-core-suse.so.9.0.0"

inherit rpm
