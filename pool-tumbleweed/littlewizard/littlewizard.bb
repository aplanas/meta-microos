SUMMARY = "Development Environment for Children"
DESCRIPTION = "Little Wizard is created especially for primary school children. It allows to \
learn using main elements of present computer languages, including: variables, \
expressions, loops, conditions, logical blocks. Every element of language is \
represented by an intuitive icon. It allows program Little Wizard without \
using keyboard, only mouse."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.2"

RPM_NAME = "littlewizard-1.2.2-17.16.aarch64.rpm"
RPM_HASH = "6844f70828b12d30b365cd5b11416cd702700f91ee6c2752d55c2ddf3f0fa571ddf2ebd5a0c34115badca3dda144abefa8b4b3ec362e692e157a3887b6a8d1a9"

RPROVIDES:${PN} += "liblanguage.so.0 \
liblw.so.0 \
littlewizard"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libstdc++.so.6 \
libxml2.so.2"

inherit rpm
