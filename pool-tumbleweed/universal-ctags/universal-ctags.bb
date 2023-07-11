SUMMARY = "A program to generate language tag files used with various editors"
DESCRIPTION = "Universal ctags, a maintained fork from Darren Hieberts project, generates tag \
files from source code for various languages to be used with Editors like \
Emacs, Vim and several others."
LICENSE = "GPL-2.0-only"

PV = "6.0.0"

RPM_NAME = "universal-ctags-6.0.0-1.3.aarch64.rpm"
RPM_HASH = "2de2b2395fd17f0172fdf3f8a5dbf6e860a9c763d41ca220751e8bde4f23b18d967969b28c61485cadc23a8beaf8a266678f0c4751bbd342511e6849997f41ba"

RPROVIDES:${PN} += "universal-ctags"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
update-alternatives"

inherit rpm
