SUMMARY = "NFC for Linux"
DESCRIPTION = "NFC support for Linux."
LICENSE = "GPL-2.0-only"

PV = "0.18"

RPM_NAME = "neard-0.18-1.4.aarch64.rpm"
RPM_HASH = "b9311c6f45790b7ba87a57a161343bc1e4df01bf4c1d316bb6754c0f26898112059ff59ab95b4fe4db0d8a9161a1150189ff402b87a75b189debae3f6d393ac0"

RPROVIDES:${PN} += "config-neard \
neard"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libglib-2.0.so.0 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
systemd"

inherit rpm
