SUMMARY = "Perl SAX 2 XS extension to Expat parser"
DESCRIPTION = "XML::SAX::ExpatXS is a direct XS extension to Expat XML parser. It implements \
 Perl SAX 2.1 interface. See http://perl-xml.sourceforge.net/perl-sax/ for \
 Perl SAX API description. Any deviations from the Perl SAX 2.1 specification \
 are considered as bugs."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.33"

RPM_NAME = "perl-XML-SAX-ExpatXS-1.33-4.26.aarch64.rpm"
RPM_HASH = "f3e74f440f703f929a88801321e7ebaa680fb2dc04b91622f50fb08bde194c35168bdc388f455dad1801e5f00b85679ae262a18ed551d74f306fbbd0d06d8e45"

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
perl--MODULE-COMPAT-5.36.1 \
perl-XML--SAX"

inherit rpm
