SUMMARY = "RPM file correctness checker"
DESCRIPTION = "rpmlint is a tool to check common errors on RPM packages. Binary and \
source packages can be checked."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.0+git20230818.5cdd21d0"

RPM_NAME = "rpmlint-mini-2.4.0+git20230818.5cdd21d0-12.12.aarch64.rpm"
RPM_HASH = "3b3610bdf640a2320a720aed89a393d16f2bdf451382b3e073ddcb2b256af076bc85a00b626a36afa147c8333b6aea3c896a84e8adadba8f92dc2820d6b0dfe9"

RPROVIDES:${PN} += "rpmlint-mini"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
cpio \
ld-linux-aarch64.so.1 \
polkit-default-privs"

inherit rpm
