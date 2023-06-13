SUMMARY = "Tool to convert ASCII/Latin Text into PostScript"
DESCRIPTION = "a2ps converts ASCII text into PostScript. This feature is used by \
apsfilter, for example, to pretty-print ASCII text. \
 \
Warning: a2ps is not able to convert complex Unicode (UTF-8) text to \
PostScript.  Only language text which can be converted from UTF-8 to \
Latin encodings are supported."
LICENSE = "GPL-3.0-or-later"

PV = "4.15"

RPM_NAME = "a2ps-4.15-1.3.aarch64.rpm"
RPM_HASH = "49e520714b46e3202379fa0a1f3a94d629e783a66e92cc5139f6573c37a1b9994a61e1a18ad35ce563670e20287425565547b6aa8f81d766ffaf15411838c158"

RPROVIDES:${PN} += "a2ps \
a2ps(aarch-64) \
a2ps-bin \
config(a2ps)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/perl \
/usr/bin/sh \
file \
ghostscript-fonts-std \
glibc \
glibc-locale \
ld-linux-aarch64.so.1()(64bit) \
liba2ps.so.1()(64bit) \
libc.so.6()(64bit) \
libgc.so.1()(64bit) \
libm.so.6()(64bit) \
libpaper.so.2()(64bit) \
sed \
w3m \
wdiff"

inherit rpm
