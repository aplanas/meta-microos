SUMMARY = "StarDict Editor"
DESCRIPTION = "This package contains the dictionary conversion tools which can convert \
dictionaries of DICT, wquick, mova and pydict to stardict format."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.1"

RPM_NAME = "stardict-tools-3.0.1-85.10.aarch64.rpm"
RPM_HASH = "597301ce5d3df1122b65d1b07c85cd61285eaf5df1f0af0d2e880a058ae886ae5610aa3fa45952cc1f9d8ab4a5a38a272758cfcaba1c45a0035dc4c128e2d0b9"

RPROVIDES:${PN} += "stardict-tools"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libmariadb.so.3 \
libpcre.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
