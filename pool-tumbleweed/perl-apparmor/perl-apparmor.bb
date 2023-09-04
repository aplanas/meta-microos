SUMMARY = "Perl interface for libapparmor functions"
DESCRIPTION = "This package provides the perl interface to AppArmor. It is used for perl \
applications interfacing with AppArmor."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "3.1.6"

RPM_NAME = "perl-apparmor-3.1.6-2.2.aarch64.rpm"
RPM_HASH = "db03625caa8e434be67f878dbf655688a48268f33e9016919f94a414e10f30538f24b60a81dc2f5f5aaf42aa0c370c0f8786999dce8808b0c6652f23a482d98f"

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
