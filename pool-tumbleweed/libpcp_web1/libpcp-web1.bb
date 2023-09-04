SUMMARY = "Performance Co-Pilot run-time web library"
DESCRIPTION = "Performance Co-Pilot (PCP) run-time web library"
LICENSE = "LGPL-2.1+"

PV = "5.2.5"

RPM_NAME = "libpcp_web1-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "80979a4532a05988338a66f29bcd68cb9e4400abeeba9206c7f3c49215fc51a81ecdd99f5208f0466ea1151fcd71fcbece9bfb5e44ad7cfa648377bcf55e6ffc"

RPROVIDES:${PN} += "libpcp-web.so.1 \
libpcp-web1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
libssl.so.3 \
libuv.so.1"

inherit rpm
