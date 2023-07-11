SUMMARY = "CUE sheet parsing library"
DESCRIPTION = "libcue parses so-called cue sheets from a char string or a FILE \
pointer."
LICENSE = "GPL-2.0-only"

PV = "2.2.1"

RPM_NAME = "libcue2-2.2.1-1.16.aarch64.rpm"
RPM_HASH = "d27722a8f6e293c82f173e642ef23a9045b0d7c863427d2a9e6fcc2adae1758ba047efc36c4528ecf3cfa17faa2683dd9e75697c5f64744aa24f900a6ae4f7ed"

RPROVIDES:${PN} += "libcue.so.2 \
libcue2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
