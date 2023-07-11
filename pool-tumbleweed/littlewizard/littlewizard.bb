SUMMARY = "Development Environment for Children"
DESCRIPTION = "Little Wizard is created especially for primary school children. It allows to \
learn using main elements of present computer languages, including: variables, \
expressions, loops, conditions, logical blocks. Every element of language is \
represented by an intuitive icon. It allows program Little Wizard without \
using keyboard, only mouse."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.2"

RPM_NAME = "littlewizard-1.2.2-17.17.aarch64.rpm"
RPM_HASH = "ec1f6eb1273497a8879699a431ec6ce4ca104fafc11bc592e99c04d9ea354b885023ca1492039e5e11c5ea5334527c82f46394f16b867045132a4aa07c1e4d87"

RPROVIDES:${PN} += "liblanguage.so.0 \
liblw.so.0 \
littlewizard"

RDEPENDS:${PN} += "/usr/bin/sh \
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
