SUMMARY = "An XS implementation of Mail::SPF"
DESCRIPTION = "This is an interface to the C library libspf2 for the purpose of \
testing. While it can be used as an SPF implementation, you can also \
use Mail::SPF, which is a little more perlish."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.01"

RPM_NAME = "perl-Mail-SPF_XS-0.01-6.14.aarch64.rpm"
RPM_HASH = "2956ad80f0b5beea2f02d0f3e26ce0fa0cd17803817d40e18c63aed77fd229606b5167213304c00ce638661228480ec218e0da770b07d32dad8a2ff9c24d2317"

RPROVIDES:${PN} += "perl-Mail--SPF-XS \
perl-Mail-SPF-XS"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
