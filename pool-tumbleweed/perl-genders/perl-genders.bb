SUMMARY = "Perl bindings for genders"
DESCRIPTION = "Necessary files for using genders with Perl."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "perl-genders-1.28.1-2.3.aarch64.rpm"
RPM_HASH = "b6c1c7d1b1e96555974ce89d4cf9258ea840e4fdf5aa5ee84810aa19fc36a065698e07136a9408c929ef952b748688e0467155c14b57d02b7f434ae29e10aea1"

RPROVIDES:${PN} += "perl(Genders) \
perl(Libgenders) \
perl-genders \
perl-genders(aarch-64)"

RDEPENDS:${PN} += "genders \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgenders.so.0()(64bit) \
perl-base"

inherit rpm
