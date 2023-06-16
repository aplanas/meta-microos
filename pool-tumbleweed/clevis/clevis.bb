SUMMARY = "A pluggable framework for automated decryption"
DESCRIPTION = "Clevis is a pluggable framework for automated decryption. It can be used to \
provide automated decryption of data or even automated unlocking of LUKS \
volumes."
LICENSE = "GPL-3.0-or-later"

PV = "19"

RPM_NAME = "clevis-19-2.1.aarch64.rpm"
RPM_HASH = "d5cedbb02366b8a94caf2f59a4a8e119759b195ac8e9dd82bdcb7c605f2f0f88dfbdcdccafe856c27b6857646c783266492d2e920a85237cdcaa4220c3d4bb27"

RPROVIDES:${PN} += "clevis"

RDEPENDS:${PN} += "/usr/bin/bash \
curl \
jose \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libjansson.so.4 \
libjose.so.0 \
tpm2.0-tools"

inherit rpm
