SUMMARY = "Perl SAX 2 XS extension to Expat parser"
DESCRIPTION = "XML::SAX::ExpatXS is a direct XS extension to Expat XML parser. It implements \
 Perl SAX 2.1 interface. See http://perl-xml.sourceforge.net/perl-sax/ for \
 Perl SAX API description. Any deviations from the Perl SAX 2.1 specification \
 are considered as bugs."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.33"

RPM_NAME = "perl-XML-SAX-ExpatXS-1.33-4.27.aarch64.rpm"
RPM_HASH = "dcabf3483a6a935169a0f28106ac939d1386ce09ee30f62ae9beadff7b978ebdba204a27775c692503e49fd62c0ac46909d9b5431725255c6d62ab83827874f0"

RPROVIDES:${PN} += "perl-XML--SAX--ExpatXS \
perl-XML--SAX--ExpatXS--ContentModel \
perl-XML--SAX--ExpatXS--Encinfo \
perl-XML--SAX--ExpatXS--Encoding \
perl-XML--SAX--ExpatXS--Preload \
perl-XML-SAX-ExpatXS"

RDEPENDS:${PN} += "/usr/bin/sh \
expat \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
perl--MODULE-COMPAT-5.38.0 \
perl-XML--SAX"

inherit rpm
