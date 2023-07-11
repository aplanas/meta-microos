SUMMARY = "A pluggable framework for automated decryption"
DESCRIPTION = "Clevis is a pluggable framework for automated decryption. It can be used to \
provide automated decryption of data or even automated unlocking of LUKS \
volumes."
LICENSE = "GPL-3.0-or-later"

PV = "19"

RPM_NAME = "clevis-19-2.2.aarch64.rpm"
RPM_HASH = "be6213924fd695202142dea4ae84cdf7e3b8ccf3107da7031fa8ea5640cb9cb218d873e09219f6eaa4d335ba0ad15c7a5d960dcd8e40381498c9d1e5895451dd"

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
