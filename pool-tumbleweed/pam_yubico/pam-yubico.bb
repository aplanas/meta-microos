SUMMARY = "Yubico Pluggable Authentication Module (PAM)"
DESCRIPTION = " \
The Yubico PAM module provides an easy way to integrate the YubiKey into your \
existing user authentication infrastructure. PAM is used by GNU/Linux, Solaris \
and Mac OS X for user authentication, and by other specialized applications \
such as NCSA MyProxy."
LICENSE = "BSD-2-Clause"

PV = "2.27"

RPM_NAME = "pam_yubico-2.27-2.10.aarch64.rpm"
RPM_HASH = "297180544a618b6bc507a41347bc507769d4d86011dae135a23d003c031c994e710dd4c35c9e847c0a7070a38a16379b869bc411d78ae7dc416ce529c41bdea9"

RPROVIDES:${PN} += "pam-yubico"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
libpam.so.0 \
libykclient.so.3 \
libykpers-1.so.1 \
libyubikey.so.0"

inherit rpm
