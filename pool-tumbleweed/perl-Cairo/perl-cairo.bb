SUMMARY = "Perl interface to the cairo 2d vector graphics library"
DESCRIPTION = "Perl interface to the cairo 2d vector graphics library"
LICENSE = "LGPL-2.1-or-later"

PV = "1.109"

RPM_NAME = "perl-Cairo-1.109-1.14.aarch64.rpm"
RPM_HASH = "a82cfd31631e1af3d288271c3b072f82a6ae992abaa73552e64d1985f45ab1e63c79a933469cc430efcaaf7aa5a5bb8efc9afea91ade6adf4ba40eacc9b3ff35"

RPROVIDES:${PN} += "perl-Cairo \
perl-Cairo--Install--Files"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
perl--MODULE-COMPAT-5.36.1 \
perl-ExtUtils--Depends \
perl-ExtUtils--PkgConfig"

inherit rpm
