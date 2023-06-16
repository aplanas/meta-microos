SUMMARY = "OpenWSMAN server and service libraries"
DESCRIPTION = "OpenWSMAN server and service libraries."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "openwsman-server-2.7.2-2.5.aarch64.rpm"
RPM_HASH = "ecb76395a5301f6e5dce656260b3c7c051153257d3a0b478668f998880a901eee109164d63493711068dee937902c97ee34457a9b908cd07eb1f6379ef499ef4"

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
