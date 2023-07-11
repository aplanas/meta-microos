SUMMARY = "An XS implementation of Mail::SPF"
DESCRIPTION = "This is an interface to the C library libspf2 for the purpose of \
testing. While it can be used as an SPF implementation, you can also \
use Mail::SPF, which is a little more perlish."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.01"

RPM_NAME = "perl-Mail-SPF_XS-0.01-6.13.aarch64.rpm"
RPM_HASH = "98139567ad6354adff7f9632b6fb732f63f7a307fbd03f91cf3372f75acddf0ddb6a7648f0f658ab15b5a5b1d1904a422cafffcc115bfc6944b64ab6d85cfc22"

RPROVIDES:${PN} += "perl-Mail--SPF-XS \
perl-Mail-SPF-XS"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
