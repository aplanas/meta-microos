SUMMARY = "Perl SAX 2 XS extension to Expat parser"
DESCRIPTION = "XML::SAX::ExpatXS is a direct XS extension to Expat XML parser. It implements \
 Perl SAX 2.1 interface. See http://perl-xml.sourceforge.net/perl-sax/ for \
 Perl SAX API description. Any deviations from the Perl SAX 2.1 specification \
 are considered as bugs."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.33"

RPM_NAME = "perl-XML-SAX-ExpatXS-1.33-4.25.aarch64.rpm"
RPM_HASH = "b3f63d7a852e5cccaa96c0850824f401bd03e2c4141cde18a9f989df1b647fe5d50239db7783a8853f0a53b10755a10fef7db7b82e9adbeb3bf2a8193307f7d6"

RPROVIDES:${PN} += "perl-XML--SAX--ExpatXS \
perl-XML--SAX--ExpatXS--ContentModel \
perl-XML--SAX--ExpatXS--Encinfo \
perl-XML--SAX--ExpatXS--Encoding \
perl-XML--SAX--ExpatXS--Preload \
perl-XML-SAX-ExpatXS"

RDEPENDS:${PN} += "/bin/sh \
expat \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
perl--MODULE-COMPAT-5.36.0 \
perl-XML--SAX"

inherit rpm
