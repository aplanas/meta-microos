SUMMARY = "Perl bindings for GNU Libidn2"
DESCRIPTION = "Provides bindings for GNU Libidn2, a C library for handling \
internationalized domain names based on IDNA 2008, Punycode and TR46."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.02"

RPM_NAME = "perl-Net-LibIDN2-1.02-1.1.aarch64.rpm"
RPM_HASH = "5aade451221cbdbbbb949683b7941133eb5eac12ccb3531403e345b2e6a59fa7f4b2a4c938fc37b8d7cbf2698675ba9449b65dc9b5551fcb514528a051a61058"

RPROVIDES:${PN} += "perl(Net::LibIDN2) \
perl-Net-LibIDN2 \
perl-Net-LibIDN2(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libidn2.so.0()(64bit) \
libidn2.so.0(IDN2_0.0.0)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
