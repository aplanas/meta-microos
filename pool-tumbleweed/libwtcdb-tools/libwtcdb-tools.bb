SUMMARY = "Utilities for reading Windows thumbnail cache databases"
DESCRIPTION = "This subpackage contains the utility programs from libwtcdb to \
read Windows thumbnail cache databases."
LICENSE = "LGPL-3.0-or-later"

PV = "20210417"

RPM_NAME = "libwtcdb-tools-20210417-3.3.aarch64.rpm"
RPM_HASH = "f974d99a7b01d90681c93c7ceafc5893ab2b3e77622fc5618dc15ea4ee16db2ded7ad946ca58bd99b702a917b1b5f7cecb6bb6f9a56c42a7899e5b81ffa551bc"

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
