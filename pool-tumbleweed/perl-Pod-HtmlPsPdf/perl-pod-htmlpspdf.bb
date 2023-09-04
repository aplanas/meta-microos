SUMMARY = "Perl module Pod::HtmlPsPdf"
DESCRIPTION = "Documentation projects builder in HTML, PS and PDF formats. \
 \
 \
 \
Authors: \
-------- \
    Stas Bekman <stas@stason.org>"
LICENSE = "Artistic-1.0"

PV = "0.04"

RPM_NAME = "perl-Pod-HtmlPsPdf-0.04-510.32.aarch64.rpm"
RPM_HASH = "e4d33e5f74950ddd1a92670486f2e379f807499638d215f60934346499b381b82a68a3f2c904aed127a9819cee01eea9a280598351745845691ace9c73d679d5"

RPROVIDES:${PN} += "perl-Pod--HtmlPsPdf \
perl-Pod--HtmlPsPdf--Book \
perl-Pod--HtmlPsPdf--Chapter \
perl-Pod--HtmlPsPdf--Common \
perl-Pod--HtmlPsPdf--Config \
perl-Pod--HtmlPsPdf--Html \
perl-Pod--HtmlPsPdf--RunTime \
perl-Pod-HtmlPsPdf"

RDEPENDS:${PN} += "/usr/bin/perl \
html2ps \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
