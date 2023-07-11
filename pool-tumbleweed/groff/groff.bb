SUMMARY = "GNU troff Document Formatting System"
DESCRIPTION = "The groff package is a stripped-down package containing the necessary \
components to read manual pages in ASCII, Latin-1, and UTF-8, plus the \
PostScript device (groff's default)."
LICENSE = "GPL-3.0-or-later"

PV = "1.22.4"

RPM_NAME = "groff-1.22.4-10.4.aarch64.rpm"
RPM_HASH = "6e8ef5b080a8c5a6dd3ea59b2b1ff4e7c09fa87ff8c1c327a0fbeb7b884ee6493494886e538499f99c91416728f47591dda8d6541290c8e3606bf5e3c9d263f8"

RPROVIDES:${PN} += "config-groff \
groff"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
