SUMMARY = "Cryptsetup LUKS2 SSH token"
DESCRIPTION = "Experimental cryptsetup plugin for unlocking LUKS2 devices with \
token connected to an SSH server."
LICENSE = "LGPL-2.0-or-later & SUSE-GPL-2.0-with-openssl-exception"

PV = "2.6.1"

RPM_NAME = "cryptsetup-ssh-2.6.1-2.1.aarch64.rpm"
RPM_HASH = "2cab21057b03923b6f6be8095cdc778518ab8f6f411b1c0001d2486061a0f6e47a737757cb84948ef22d222f32bd48b7689887c39ec14d2c6590af60aa60a70e"

RPROVIDES:${PN} += "cryptsetup-ssh \
libcryptsetup-token-ssh.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcryptsetup.so.12 \
libjson-c.so.5 \
libssh.so.4"

inherit rpm
