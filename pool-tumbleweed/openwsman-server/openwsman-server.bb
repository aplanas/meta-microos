SUMMARY = "OpenWSMAN server and service libraries"
DESCRIPTION = "OpenWSMAN server and service libraries."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "openwsman-server-2.7.2-2.8.aarch64.rpm"
RPM_HASH = "87d4c4a21ea5feb0990725cf7bfb95fbcd3071bd4174eeed837d01b8bf514811869b0c1814af073d7e8fb14ed0f34fe3e8cef71617e6b46239510e5555802a32"

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
