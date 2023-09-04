SUMMARY = "Tool for boot loader configuration"
DESCRIPTION = "Shell script wrapper for configuring various boot loaders."
LICENSE = "GPL-2.0-or-later"

PV = "1.6"

RPM_NAME = "perl-Bootloader-1.6-1.2.aarch64.rpm"
RPM_HASH = "a1693154a01342808f5de159c58c6a2da5f52021d4aeba89f51511e0740def706adb5a9ed202c405ec1e9686879306bcd10a56beae1dc06251513e196fe729a0"

RPROVIDES:${PN} += "/sbin/update-bootloader \
perl-Bootloader"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
coreutils \
perl-base"

inherit rpm
