SUMMARY = "PAM Authentication Module for Using Cryptographic Tokens"
DESCRIPTION = "Pam_p11 is a pluggable authentication module (pam) package for using \
cryptographic tokens, such as smart cards and usb crypto tokens, for \
authentication. \
 \
Pam_p11 has limited functionality since it simply compares public \
keys to sign some random data and verifies the signature with the \
public key. This works fine for small installations but may have \
security implications, see README.SUSE."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.1"

RPM_NAME = "pam_p11-0.3.1-3.2.aarch64.rpm"
RPM_HASH = "408d692f373bbbb4bca0f94c3bfb8e2ae0721629461ae917029f7cd8046d4b93885999f7baa480e5fc04d442983c253f6283d42627a025fa9ed1860d53da858b"

RPROVIDES:${PN} += "pam-p11"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libp11.so.3 \
libpam.so.0"

inherit rpm
