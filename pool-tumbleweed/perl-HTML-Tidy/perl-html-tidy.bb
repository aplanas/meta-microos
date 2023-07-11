SUMMARY = "(X)HTML validation in a Perl object"
DESCRIPTION = "'HTML::Tidy' is an HTML checker in a handy dandy object. It's meant as a \
replacement for HTML::Lint. If you're currently an HTML::Lint user looking \
to migrate, see the section Converting from HTML::Lint."
LICENSE = "Artistic-2.0"

PV = "1.60"

RPM_NAME = "perl-HTML-Tidy-1.60-1.30.aarch64.rpm"
RPM_HASH = "75ec36a8d69c0d1d5313cd813ab317ec47a8cf10349c2fae384b3b0f0d8a63b358144fd5f684742c5232d01f7d93e1e26081c3c2dbdbd4c998362af3afb77453"

RPROVIDES:${PN} += "perl-HTML--Tidy \
perl-HTML--Tidy--Message \
perl-HTML-Tidy"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtidyp-1.04.so.0 \
perl--MODULE-COMPAT-5.36.1 \
perl-LWP--Simple \
perl-Test--More"

inherit rpm
