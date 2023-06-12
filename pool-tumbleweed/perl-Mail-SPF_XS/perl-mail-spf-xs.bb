SUMMARY = "An XS implementation of Mail::SPF"
DESCRIPTION = "This is an interface to the C library libspf2 for the purpose of \
testing. While it can be used as an SPF implementation, you can also \
use Mail::SPF, which is a little more perlish."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.01"

RPM_NAME = "perl-Mail-SPF_XS-0.01-6.12.aarch64.rpm"
RPM_HASH = "651c75e679c788b9b4d00be446dd6a1cc743fc8d74bb5199ae7ec8164063f15d5ed1d44f26b7c4ed35fa828647aae6d68e49ad2dcf5eea15625ec3f1c189efc6"

RPROVIDES:${PN} += "perl(Mail::SPF_XS) \
perl-Mail-SPF_XS \
perl-Mail-SPF_XS(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
