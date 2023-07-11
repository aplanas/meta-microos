SUMMARY = "Perl bindings for genders"
DESCRIPTION = "Necessary files for using genders with Perl."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "perl-genders-1.28.1-2.5.aarch64.rpm"
RPM_HASH = "cd5e82b604632d4824c6ea00a1b9c7e3077504110797b1e5a812d308e20dc15875a4d532a4759f17b4fdae45020f61b59c21a31d0c67ae5f9edddf7b44a1e5bc"

RPROVIDES:${PN} += "perl-Genders \
perl-Libgenders \
perl-genders"

RDEPENDS:${PN} += "genders \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgenders.so.0 \
perl-base"

inherit rpm
