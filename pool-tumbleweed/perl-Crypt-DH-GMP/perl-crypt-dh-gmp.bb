SUMMARY = "Crypt::DH Using GMP Directly"
DESCRIPTION = "Crypt::DH::GMP is a (somewhat) portable replacement to Crypt::DH, \
implemented mostly in C."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.00012"

RPM_NAME = "perl-Crypt-DH-GMP-0.00012-4.29.aarch64.rpm"
RPM_HASH = "28fa41607334e95d1d2478f4bdba9d2bea3e283c0c13b0c8073d03f1979c8895b093c07e4abf5c94e5efce8b65a86c7b5cfd9c8c4f41630854d1d217b58be454"

RPROVIDES:${PN} += "perl(Crypt::DH::GMP) \
perl(Crypt::DH::GMP::Compat) \
perl-Crypt-DH-GMP \
perl-Crypt-DH-GMP(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
