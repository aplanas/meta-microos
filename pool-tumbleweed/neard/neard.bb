SUMMARY = "NFC for Linux"
DESCRIPTION = "NFC support for Linux."
LICENSE = "GPL-2.0-only"

PV = "0.18"

RPM_NAME = "neard-0.18-1.3.aarch64.rpm"
RPM_HASH = "bfd9dfa63212fd380fabd11adc01082133edb640c4560726f185d42c5d7a52aa90209449824ab7c9574fcb0a4ada71ad82845ee1abb06e745ca60f7a63393466"

RPROVIDES:${PN} += "config-neard \
neard"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libglib-2.0.so.0 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
systemd"

inherit rpm
