SUMMARY = "Utilities for reading Windows thumbnail cache databases"
DESCRIPTION = "This subpackage contains the utility programs from libwtcdb to \
read Windows thumbnail cache databases."
LICENSE = "LGPL-3.0-or-later"

PV = "20210417"

RPM_NAME = "libwtcdb-tools-20210417-3.4.aarch64.rpm"
RPM_HASH = "c9acf18d771264e716c357a16d484e1c39670b20c03062555379b4b9ed716f2a2d6668b1cb41e003e3a2f21518658426dc2fc82c88f2496ae1b7156e821638a5"

RPROVIDES:${PN} += "libwtcdb-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libcfile.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcpath.so.1 \
libwtcdb.so.1"

inherit rpm
