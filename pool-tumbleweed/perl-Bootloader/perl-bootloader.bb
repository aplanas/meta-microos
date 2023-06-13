SUMMARY = "Tool for boot loader configuration"
DESCRIPTION = "Shell script wrapper for configuring various boot loaders."
LICENSE = "GPL-2.0-or-later"

PV = "1.2"

RPM_NAME = "perl-Bootloader-1.2-1.1.aarch64.rpm"
RPM_HASH = "a24c43ae7e8e338de1575309539ac7e30a98bedffb9c5502d0032764e3af45d2a23ba6a2ae764c8bd13bc4cff3fce6dfffbf98972c945e1d8850cb2809c26817"

RPROVIDES:${PN} += "/sbin/update-bootloader \
perl-Bootloader \
perl-Bootloader(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/perl \
coreutils \
perl-base"

inherit rpm
