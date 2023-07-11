SUMMARY = "C compiler runtime library"
DESCRIPTION = "Libgcc is needed for dynamically linked C programs."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "12.3.0+git1204"

RPM_NAME = "libgcc_s1-gcc12-12.3.0+git1204-1.33.aarch64.rpm"
RPM_HASH = "e4bafaaf218d952fc847144f3e64f4f2f3101d26ccd890a800d34a5601e5a3edb146e379c1d1e56782cf10dfb813fa3e31d712a9e53decc2e38c601cb200b37b"

RPROVIDES:${PN} += "libgcc-s.so.1 \
libgcc-s1 \
libgcc-s1-gcc12"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
