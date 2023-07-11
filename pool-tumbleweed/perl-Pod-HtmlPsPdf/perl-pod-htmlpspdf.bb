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

RPM_NAME = "perl-Pod-HtmlPsPdf-0.04-510.31.aarch64.rpm"
RPM_HASH = "73005d07f2e8dd97ec2557848ffaf70d2ac412887afe575c2a2ba4b004ef7f0152519391c7dfd3444449f2814108aac0ac6800c3a1c9ddda9d194dad1d7d990f"

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
perl--MODULE-COMPAT-5.36.1"

inherit rpm
