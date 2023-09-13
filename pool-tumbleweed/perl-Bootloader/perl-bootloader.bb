SUMMARY = "Tool for boot loader configuration"
DESCRIPTION = "Shell script wrapper for configuring various boot loaders."
LICENSE = "GPL-2.0-or-later"

PV = "1.8"

RPM_NAME = "perl-Bootloader-1.8-1.1.aarch64.rpm"
RPM_HASH = "8815d31cd6cfad55e52f0ee5673e3fbe15a6da632ee773c431557ef48c0b5cb1da1babf0799dc653a0a8cf27d30da2c056b470b90f55dbfa138e0059e766f2a2"

RPROVIDES:${PN} += "/sbin/update-bootloader \
perl-Bootloader"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
coreutils \
perl-base"

inherit rpm
