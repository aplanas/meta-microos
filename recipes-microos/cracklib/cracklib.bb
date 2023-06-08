SUMMARY = "Library to crack passwords using dictionaries"
DESCRIPTION = "CrackLib tests passwords to determine whether they match \
certainsecurity-oriented characteristics. You can use CrackLib to \
stopusers from choosing passwords that are too simple.This package \
contains a full dictionary file used by cracklib."
LICENSE = "LGPL-2.1-only"

PV = "2.9.8"

RPM_NAME = "cracklib-2.9.8-1.2.aarch64.rpm"
RPM_HASH = "19f59ee66e8721f73d2ce4ede07a367c04d4b747d2282b23242fd8a9b3a80b6bf2fe408ff3e4cc1a9a2a50fc4561d70f2fb03fbf4da11cc4a94cbcafeb68d9c2"

RPROVIDES:${PN} += "cracklib cracklib(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cracklib-dict ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrack.so.2()(64bit)"

inherit rpm
