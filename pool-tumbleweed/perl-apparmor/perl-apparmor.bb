SUMMARY = "Perl interface for libapparmor functions"
DESCRIPTION = "This package provides the perl interface to AppArmor. It is used for perl \
applications interfacing with AppArmor."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "3.1.6"

RPM_NAME = "perl-apparmor-3.1.6-1.1.aarch64.rpm"
RPM_HASH = "647ca75ed1dbaea1b82c3058f8ab0ff2542ee7303dc2ef70270883d15d12b60e3dd36b38e8d25b1d7f79a76d4adf4d06a1804f9ad693b25fb51eaf344d2fbb59"

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
