SUMMARY = "Bit::Vector Perl module"
DESCRIPTION = "Bit::Vector Perl module"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "7.4"

RPM_NAME = "perl-Bit-Vector-7.4-1.38.aarch64.rpm"
RPM_HASH = "52e15b62337e0ef6f15452411f749628350f36fe4f58fd0f1e5eb3b12202f6ac4cc9911de0b8739fb7ad860f00cfd775cb98536317a33fc9eaae104219ba9681"

RPROVIDES:${PN} += "perl(Bit::Vector) \
perl(Bit::Vector::Overload) \
perl(Bit::Vector::String) \
perl-Bit-Vector \
perl-Bit-Vector(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
perl(:MODULE_COMPAT_5.36.0) \
perl(Carp::Clan) \
perl(Storable)"

inherit rpm
