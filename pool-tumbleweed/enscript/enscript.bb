SUMMARY = "An ASCII to PostScript(tm) Converter"
DESCRIPTION = "Enscript converts ASCII files to PostScript and writes the generated \
output to a file or sends it directly to the printer. \
 \
The Enscript configuration file is in /etc/enscript.cfg. \
 \
Warning: enscript is not able to convert complex unicode (UTF-8) text \
to PostScript.	Only language text which can be converted from UTF-8 to \
latin encodings are supported with the help of a wrapper script. ~ ~"
LICENSE = "GPL-3.0-or-later"

PV = "1.6.6"

RPM_NAME = "enscript-1.6.6-2.7.aarch64.rpm"
RPM_HASH = "537d6eb48e70399556c8a098aa1879fa6865752ac38d2e38182019992eac2fd73094fb15c3a3fc3ad4fdb0e459b26a9f21a0388a16fd0eba7543ccefdf5abaeb"

RPROVIDES:${PN} += "config(enscript) \
enscript \
enscript(aarch-64) \
genscript \
nenscrip"

RDEPENDS:${PN} += "/bin/bash \
/bin/sed \
/bin/sh \
/usr/bin/file \
/usr/bin/iconv \
/usr/bin/perl \
ghostscript-fonts-std \
glibc-locale \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
