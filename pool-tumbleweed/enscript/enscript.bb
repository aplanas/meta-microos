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

RPM_NAME = "enscript-1.6.6-2.8.aarch64.rpm"
RPM_HASH = "50ff00d717dd11d0b1ba50e70e8075ef378a6319666b9c78f7330cb4242686678569b653487355db9781cf299349e7591ccecf559b4aa591ad43b1ec5a2666cc"

RPROVIDES:${PN} += "config-enscript \
enscript \
genscript \
nenscrip"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/file \
/usr/bin/iconv \
/usr/bin/perl \
/usr/bin/sed \
/usr/bin/sh \
ghostscript-fonts-std \
glibc-locale \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
