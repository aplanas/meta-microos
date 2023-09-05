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

PV = "0.5.0"

RPM_NAME = "pam_p11-0.5.0-1.1.aarch64.rpm"
RPM_HASH = "95d3777620ab29c69752da8aa0c68ac7de8c7244b7938a3853a2c6abed62632dad2ac5b5911870e5a9f41f39f24984d20650d3a4f31d7242332bfa1b7fe6ad72"

RPROVIDES:${PN} += "pam-p11"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libp11.so.3 \
libpam.so.0"

inherit rpm
