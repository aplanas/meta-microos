SUMMARY = "StarDict Editor"
DESCRIPTION = "This package contains the dictionary conversion tools which can convert \
dictionaries of DICT, wquick, mova and pydict to stardict format."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.1"

RPM_NAME = "stardict-tools-3.0.1-85.11.aarch64.rpm"
RPM_HASH = "f2544612658dcdb80ee0be635354067199dca59ad81a6c3d22eaa114c3042cc77360d48234e32900c460c71ab054bbff98048e90f6129c918aafbe019c25a2c5"

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
