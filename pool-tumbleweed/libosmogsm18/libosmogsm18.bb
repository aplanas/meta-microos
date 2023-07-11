SUMMARY = "Osmocom GSM utility library"
DESCRIPTION = "libosmocore is a package with various utility functions that were \
originally developed as part of the OpenBSC project. \
 \
The libosmogsm library in particular is a collection of common code \
used in various GSM related sub-projects inside the Osmocom family of \
projects. It includes A5/1 and A5/2 ciphers, COMP148v1, a LAPDm \
implementation, a GSM TLV parser, SMS utility routines as well as \
protocol definitions for a series of protocols."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmogsm18-1.8.0-1.2.aarch64.rpm"
RPM_HASH = "48e10fdcef4f8bdee6d85f730215017b455e4b60e90e2b7b371e78a0f19f0ad93ca3589cb87fcceac9a71ac0b5fe5ba8d9cc4d0594444121433cde1270652b4c"

RPROVIDES:${PN} += "libosmogsm.so.18 \
libosmogsm18"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
libosmocore.so.20 \
libosmoisdn.so.0 \
libtalloc.so.2"

inherit rpm
