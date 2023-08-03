SUMMARY = "Perl interface for libapparmor functions"
DESCRIPTION = "This package provides the perl interface to AppArmor. It is used for perl \
applications interfacing with AppArmor."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "3.1.6"

RPM_NAME = "perl-apparmor-3.1.6-2.1.aarch64.rpm"
RPM_HASH = "5f9e959993a6fcf18179692387efc7663273852422f80208e62c2b22bee0aa3cf8c338f1f7c482b5d73c8128f74740de2a14fa2fda9689bf6a89b42204930d59"

RPROVIDES:${PN} += "perl-LibAppArmor \
perl-LibAppArmor--aa-log-record \
perl-LibAppArmorc \
perl-apparmor \
perl-libapparmor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libapparmor.so.1 \
libapparmor1 \
libc.so.6 \
perl"

inherit rpm
