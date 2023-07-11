SUMMARY = "Utilities for reading SuperFetch databases"
DESCRIPTION = "This subpackage contains the utility programs from libagdb to \
read SuperFetch databases."
LICENSE = "LGPL-3.0-or-later"

PV = "20210429"

RPM_NAME = "libagdb-tools-20210429-3.7.aarch64.rpm"
RPM_HASH = "34e15ab0a9011340f4bb2de2a02e09da9b2514a8971ef48536572f9d2d6768947963170c47a503528a9d7b80d02abb5ce48c7027fbdd4ea340991db72e3440db"

RPROVIDES:${PN} += "libagdb-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libagdb.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfdatetime.so.1"

inherit rpm
