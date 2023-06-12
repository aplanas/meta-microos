SUMMARY = "MagicPoint, an X Window System Presentation Tool"
DESCRIPTION = "MagicPoint is an X Window System presentation tool. It is designed to \
make simple presentations easy while making complicated presentations \
possible. Its presentation file (the suffix is typically .mgp) is plain \
text so that you can create presentation files quickly with your \
favorite editor (Emacs, for example). The package also includes the \
tools mgp2html, mgp2ps, and mgp2latex, which convert mgp presentations \
into other file formats."
LICENSE = "BSD-3-Clause"

PV = "1.13a"

RPM_NAME = "mgp-1.13a-121.10.aarch64.rpm"
RPM_HASH = "b0e96525d7d262fd9972a24e8ae64e7982fd59c79cb5f3c0800d5e2cb5fe3e702c48fe1f0fd63f1abff6b10337ee6aeac5a39e5d26189ad47c902c7392f40662"

RPROVIDES:${PN} += "magicpoint \
mgp \
mgp(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libImlib2.so.1()(64bit) \
libX11.so.6()(64bit) \
libXft.so.2()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
perl \
sharutils"

inherit rpm
