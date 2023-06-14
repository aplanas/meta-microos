SUMMARY = "Utilities for reading SuperFetch databases"
DESCRIPTION = "This subpackage contains the utility programs from libagdb to \
read SuperFetch databases."
LICENSE = "LGPL-3.0-or-later"

PV = "20210429"

RPM_NAME = "libagdb-tools-20210429-3.5.aarch64.rpm"
RPM_HASH = "fc08393abb222bd715cd56e897a7dfc36e8fc49823eb21b4f67907dcacce9706c1c046d05cd5a02019b410b4b4ae5c6dc5b1c936d080299fbc2b68a3eb3b32b6"

RPROVIDES:${PN} += "libagdb-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libagdb.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfdatetime.so.1"

inherit rpm
