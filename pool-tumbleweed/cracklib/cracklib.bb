SUMMARY = "Library to crack passwords using dictionaries"
DESCRIPTION = "CrackLib tests passwords to determine whether they match \
certainsecurity-oriented characteristics. You can use CrackLib to \
stopusers from choosing passwords that are too simple.This package \
contains a full dictionary file used by cracklib."
LICENSE = "LGPL-2.1-only"

PV = "2.9.11"

RPM_NAME = "cracklib-2.9.11-1.1.aarch64.rpm"
RPM_HASH = "e583d4394457542d7b9ad5d30782320347770f2e00e4fcb03210fe77547e74def448d9df5e3322faf96fb4e98c934feff8764b7848c74c7c1149e94cd30e07c6"

RPROVIDES:${PN} += "cracklib"

RDEPENDS:${PN} += "/usr/bin/sh \
cracklib-dict \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrack.so.2"

inherit rpm
