SUMMARY = "(X)HTML validation in a Perl object"
DESCRIPTION = "'HTML::Tidy' is an HTML checker in a handy dandy object. It's meant as a \
replacement for HTML::Lint. If you're currently an HTML::Lint user looking \
to migrate, see the section Converting from HTML::Lint."
LICENSE = "Artistic-2.0"

PV = "1.60"

RPM_NAME = "perl-HTML-Tidy-1.60-1.31.aarch64.rpm"
RPM_HASH = "c086de3330cd7cbef09993d4e52a0af7b6d0c32450e55e70345ebaec6d2e125b8bf7bc1df8aefd894641b334ab2e080717962826e73cc423d93e95ad91426e6f"

RPROVIDES:${PN} += "perl-HTML--Tidy \
perl-HTML--Tidy--Message \
perl-HTML-Tidy"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtidyp-1.04.so.0 \
perl--MODULE-COMPAT-5.38.0 \
perl-LWP--Simple \
perl-Test--More"

inherit rpm
