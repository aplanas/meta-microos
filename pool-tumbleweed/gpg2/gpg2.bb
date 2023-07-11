SUMMARY = "File encryption, decryption, signature creation and verification utility"
DESCRIPTION = "GnuPG is a hybrid-encryption software program; it uses a combination \
of symmetric-key and public-key cryptography to encrypt/decrypt \
messages and/or to sign and verify them. \
 \
gpg2 provides GPGSM, gpg-agent, and a keybox library."
LICENSE = "GPL-3.0-or-later"

PV = "2.3.8"

RPM_NAME = "gpg2-2.3.8-3.1.aarch64.rpm"
RPM_HASH = "032f8b5e722b4140caa14c59c3db9620e54f226b0ba980f287a984902130fe7bd52c4d2d8fa7f8722b609a0cec8be4b1959d04d2e76a2d13a5fe9098eac4b7a4"

RPROVIDES:${PN} += "config-gpg2 \
gnupg \
gpg \
gpg2 \
newpg"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libassuan.so.0 \
libassuan0 \
libbz2.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libgcrypt20 \
libgpg-error.so.0 \
libksba \
libksba.so.8 \
libnpth.so.0 \
libreadline.so.8 \
libsqlite3.so.0 \
libusb-1.0.so.0 \
libz.so.1 \
pinentry"

inherit rpm
