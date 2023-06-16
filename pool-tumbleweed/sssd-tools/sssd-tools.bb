SUMMARY = "Commandline tools for sssd"
DESCRIPTION = "The packages contains commandline tools for managing users and groups using \
the 'local' id provider of the System Security Services Daemon (sssd)."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "sssd-tools-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "b3039b0f66f87639be0fb3014ca3372eac7be7bc0d456dacc655611729280dce714ec70d76b3b1c7c36f15efb30237ae07a9cc6e6a224e8215490ebec0db3960"

RPROVIDES:${PN} += "sssd-tools"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdhash.so.1 \
libifp-iface-sync.so \
libldb.so.2 \
libpam-misc.so.0 \
libpam.so.0 \
libpopt.so.0 \
libref-array.so.1 \
libsss-certmap.so.0 \
libsss-crypt.so \
libsss-debug.so \
libsss-iface-sync.so \
libsss-iface.so \
libsss-sbus-sync.so \
libsss-sbus.so \
libsss-util.so \
libtalloc.so.2 \
python-abi \
python3-sssd-config \
sssd"

inherit rpm
