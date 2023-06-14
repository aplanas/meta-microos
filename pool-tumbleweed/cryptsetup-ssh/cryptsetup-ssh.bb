SUMMARY = "Cryptsetup LUKS2 SSH token"
DESCRIPTION = "Experimental cryptsetup plugin for unlocking LUKS2 devices with \
token connected to an SSH server."
LICENSE = "LGPL-2.0-or-later & SUSE-GPL-2.0-with-openssl-exception"

PV = "2.6.1"

RPM_NAME = "cryptsetup-ssh-2.6.1-1.3.aarch64.rpm"
RPM_HASH = "f20ee0c7d590647465dd4af01ee938a5870096f6baca73f0f93e00b9e4d3a3e8440b5c5de908e3015ba708b17fbaf0f51c0c32c8511bceab6f7032dea4f8445f"

RPROVIDES:${PN} += "cryptsetup-ssh \
libcryptsetup-token-ssh.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcryptsetup.so.12 \
libjson-c.so.5 \
libssh.so.4"

inherit rpm
