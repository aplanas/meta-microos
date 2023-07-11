SUMMARY = "Screen reader for the Linux console"
DESCRIPTION = "SUSE blinux is a screen reader for the Linux console. It supports \
braille displays."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.0.20130317.git7a75bc29"

RPM_NAME = "sbl-3.5.0.20130317.git7a75bc29-6.15.aarch64.rpm"
RPM_HASH = "f5ebbc0c17080429c84bcc8488e899cf767dae647557df4d9e0cc8a91ec822981b86b5e94c84fb48ec58e7105324ecf5a3a18afa4bda8e476276e346098aae2a"

RPROVIDES:${PN} += "config-sbl \
libbrld.so.1 \
libsbl-alva.so.2 \
libsbl-alvausb.so.2 \
libsbl-baum.so.2 \
libsbl-fhp-usb.so.2 \
libsbl-fhp.so.2 \
libsbl-ht.so.2 \
libsbl-none.so.2 \
libsbl-pwrbrl.so.2 \
libsbl-tieman.so.2 \
sbl"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
