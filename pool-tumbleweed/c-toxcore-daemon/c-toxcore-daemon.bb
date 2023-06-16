SUMMARY = "Bootstrap-daemon for toxcore"
DESCRIPTION = "Bootstrap-daemon to dispose hashtable for toxcore."
LICENSE = "GPL-3.0-only"

PV = "0.2.18"

RPM_NAME = "c-toxcore-daemon-0.2.18-1.4.aarch64.rpm"
RPM_HASH = "a1f3911f9a1efa6cf0a5fb6451776b0d0c4c8a29a939e12afe8dedca8c0c193c43c648bff77c160a97acae965c9b8809a1495f8afe9b5f850351f326cba30079"

RPROVIDES:${PN} += "c-toxcore-daemon \
config-c-toxcore-daemon"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libconfig.so.11 \
libsodium.so.23 \
libtoxcore.so.2"

inherit rpm
