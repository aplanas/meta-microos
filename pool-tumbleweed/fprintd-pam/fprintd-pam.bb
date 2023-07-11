SUMMARY = "PAM module for fingerprint authentication"
DESCRIPTION = "PAM module that uses the fprintd D-Bus service for fingerprint \
authentication."
LICENSE = "GPL-2.0-or-later"

PV = "1.94.2"

RPM_NAME = "fprintd-pam-1.94.2-2.5.aarch64.rpm"
RPM_HASH = "b92b33a0770171a27371bfabb2aafeb74c5f7b5d8d1e331174489bf799dd2793b537827795f8fe30c20daeb7f7de75f2c48b2818039737d66f3cd7bc8a8f5630"

RPROVIDES:${PN} += "fprintd-pam \
pam-fp \
pam-fprint \
pam-thinkfinger"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
fprintd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpam.so.0 \
libsystemd.so.0 \
pam \
pam-config"

inherit rpm
