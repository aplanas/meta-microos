SUMMARY = "CUE sheet parsing library"
DESCRIPTION = "libcue parses so-called cue sheets from a char string or a FILE \
pointer."
LICENSE = "GPL-2.0-only"

PV = "2.2.1"

RPM_NAME = "libcue2-2.2.1-1.15.aarch64.rpm"
RPM_HASH = "58f13cd7d7ce5bed1a3eaf95c55348e31ee73b43c6e5b0601a9dcda66715eaf47c3346fd3ca2105897a278dd41db1a5e3e2e46e19b32ae4b3fa47fdc07024c98"

RPROVIDES:${PN} += "libcue.so.2 \
libcue2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
