SUMMARY = "Base class for HTML formatters"
DESCRIPTION = "Base class for HTML formatters"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.12"

RPM_NAME = "perl-HTML-Format-2.12-1.19.noarch.rpm"
RPM_HASH = "fab06c67d02776f9e9fbe09930fdbcab52581addc865e46a7ffda2e77c1f116765b3f166eeece68f9a64d798a3355f23e9ee5ba1d0f22586f4265041980af2b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--FormatMarkdown \
perl-HTML--FormatPS \
perl-HTML--FormatRTF \
perl-HTML--FormatText \
perl-HTML--Formatter \
perl-HTML-Format"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Font--Metrics--Courier \
perl-Font--Metrics--CourierBold \
perl-Font--Metrics--CourierBoldOblique \
perl-Font--Metrics--CourierOblique \
perl-Font--Metrics--Helvetica \
perl-Font--Metrics--HelveticaBold \
perl-Font--Metrics--HelveticaBoldOblique \
perl-Font--Metrics--HelveticaOblique \
perl-Font--Metrics--TimesBold \
perl-Font--Metrics--TimesBoldItalic \
perl-Font--Metrics--TimesItalic \
perl-Font--Metrics--TimesRoman \
perl-HTML--Element \
perl-HTML--TreeBuilder \
perl-parent"

inherit rpm
