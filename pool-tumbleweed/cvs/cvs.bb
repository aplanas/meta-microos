SUMMARY = "Concurrent Versions System"
DESCRIPTION = "CVS is a front-end to the rcs (Revision Control System) included in the \
standard Linux distributions. PCL-CVS, an emacs (Emacs) front-end for \
CVS, is also included."
LICENSE = "GPL-2.0-only"

PV = "1.12.13"

RPM_NAME = "cvs-1.12.13-2.7.aarch64.rpm"
RPM_HASH = "83db48684104faa683ef6f8b81417d4cc7b605bfdec0cee9ca2f3fb4d9f15ed51da4fcb028786ef40d2ab076da00815596f2260697df6686c8c378378a47a4f2"

RPROVIDES:${PN} += "config(cvs) \
cvs \
cvs(aarch-64)"

RDEPENDS:${PN} += "/bin/mktemp \
/bin/sh \
/usr/bin/csh \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypt.so.1()(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
libz.so.1()(64bit) \
openssh"

inherit rpm
