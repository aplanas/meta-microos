SUMMARY = "OpenWSMAN server and service libraries"
DESCRIPTION = "OpenWSMAN server and service libraries."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "openwsman-server-2.7.2-2.5.aarch64.rpm"
RPM_HASH = "ecb76395a5301f6e5dce656260b3c7c051153257d3a0b478668f998880a901eee109164d63493711068dee937902c97ee34457a9b908cd07eb1f6379ef499ef4"

RPROVIDES:${PN} += "config(openwsman-server) \
libredirect.so.1()(64bit) \
libwsman_cim_plugin.so.1()(64bit) \
libwsman_file_auth.so.1()(64bit) \
libwsman_identify_plugin.so.1()(64bit) \
libwsman_pam_auth.so.1()(64bit) \
libwsman_server.so.1()(64bit) \
libwsman_test.so.1()(64bit) \
openwsman-server \
openwsman-server(aarch-64)"

RDEPENDS:${PN} += "/bin/hostname \
/bin/sh \
coreutils \
diffutils \
fillup \
grep \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcmpisfcc.so.1()(64bit) \
libcrypt.so.1()(64bit) \
libcrypto.so.3()(64bit) \
libpam.so.0()(64bit) \
libssl.so.3()(64bit) \
libwsman.so.1()(64bit) \
sed"

inherit rpm
