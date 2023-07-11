SUMMARY = "Shared library for Budgie theming"
DESCRIPTION = "Budgie theming engine shared library package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.7.2+0"

RPM_NAME = "libbudgietheme0-10.7.2+0-1.2.aarch64.rpm"
RPM_HASH = "5129d5413579789dab73688de817f77c381caca46956412918f6c88b0200f575ee5b8c4f6eb9a067f2b4bd51568040c5f3411e844f15cfa2d8f832ba7f37b1fd"

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
