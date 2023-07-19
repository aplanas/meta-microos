SUMMARY = "Cryptsetup LUKS2 SSH token"
DESCRIPTION = "Experimental cryptsetup plugin for unlocking LUKS2 devices with \
token connected to an SSH server."
LICENSE = "LGPL-2.0-or-later & SUSE-GPL-2.0-with-openssl-exception"

PV = "2.6.1"

RPM_NAME = "cryptsetup-ssh-2.6.1-3.1.aarch64.rpm"
RPM_HASH = "bf87657c421af42d2f345b7f9a358f487d13c23723c44a1b89fad84e4f4f4be6f6725bf1ee56e2ffcfb95e5d5c847114962771fccf792549f71fdcf44232c511"

RPROVIDES:${PN} += "cryptsetup-ssh \
libcryptsetup-token-ssh.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcryptsetup.so.12 \
libjson-c.so.5 \
libssh.so.4"

inherit rpm
