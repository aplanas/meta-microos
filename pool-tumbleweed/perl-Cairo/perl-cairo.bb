SUMMARY = "Perl interface to the cairo 2d vector graphics library"
DESCRIPTION = "Perl interface to the cairo 2d vector graphics library"
LICENSE = "LGPL-2.1-or-later"

PV = "1.109"

RPM_NAME = "perl-Cairo-1.109-1.15.aarch64.rpm"
RPM_HASH = "af2e09303dbec35bdf29303e1584fa1ced03cd80ad129c219af472003d614c8314572b58ac19b0936eb8a44e660c60a4706ed4593fe72030540c55e9e17e6242"

RPROVIDES:${PN} += "perl-Cairo \
perl-Cairo--Install--Files"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
perl--MODULE-COMPAT-5.38.0 \
perl-ExtUtils--Depends \
perl-ExtUtils--PkgConfig"

inherit rpm
