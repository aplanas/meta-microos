SUMMARY = "Perl interface for libapparmor functions"
DESCRIPTION = "This package provides the perl interface to AppArmor. It is used for perl \
applications interfacing with AppArmor."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "3.1.4"

RPM_NAME = "perl-apparmor-3.1.4-1.1.aarch64.rpm"
RPM_HASH = "c8dee524bb00c39ae6747c3b82bbf8627ad46b9835bae75331e7473d4937f47f2f40fd2f4eb283e1a1cc83b1f90e717e08317f0c00ab45e080527ffd3b0adaf6"

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
