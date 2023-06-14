SUMMARY = "MATE Desktop archive manager"
DESCRIPTION = "Engrampa is an archive manager for the MATE Desktop Environment. \
This means that you can create and modify archives; view the \
content of an archive; view and modify a file contained in the \
archive; extract files from the archive."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "engrampa-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "531b164b73107f4b86a5ae1d7e89039130eb98bc9304257f2df87c089b1bb53b423424858ca56a4e78c824059cd554880057f40d0bd6d6589955cebbcb30ce44"

RPROVIDES:${PN} += "engrampa \
mate-file-archiver"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0"

inherit rpm
