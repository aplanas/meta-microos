SUMMARY = "OpenWSMAN server and service libraries"
DESCRIPTION = "OpenWSMAN server and service libraries."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "openwsman-server-2.7.2-2.9.aarch64.rpm"
RPM_HASH = "4537009d4be27bfaa3ead0fa5eec8d98ddde317902246923593116d793ec02c0a6e804b6fbcec826b27b331fc6cea65382e7a316a4ddeb14d968108049e10c91"

RPROVIDES:${PN} += "config-openwsman-server \
libredirect.so.1 \
libwsman-cim-plugin.so.1 \
libwsman-file-auth.so.1 \
libwsman-identify-plugin.so.1 \
libwsman-pam-auth.so.1 \
libwsman-server.so.1 \
libwsman-test.so.1 \
openwsman-server"

RDEPENDS:${PN} += "/usr/bin/hostname \
/usr/bin/sh \
coreutils \
diffutils \
fillup \
grep \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcmpisfcc.so.1 \
libcrypt.so.1 \
libcrypto.so.3 \
libpam.so.0 \
libssl.so.3 \
libwsman.so.1 \
sed"

inherit rpm
