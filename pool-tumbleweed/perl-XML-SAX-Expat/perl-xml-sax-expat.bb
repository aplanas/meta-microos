SUMMARY = "SAX2 Driver for Expat (XML::Parser)"
DESCRIPTION = "This is an implementation of a SAX2 driver sitting on top of Expat \
(XML::Parser) which Ken MacLeod posted to perl-xml and which I have \
updated. \
 \
It is still incomplete, though most of the basic SAX2 events should be \
available. The SAX2 spec is currently available from \
http://perl-xml.sourceforge.net/perl-sax/. \
 \
A more friendly URL as well as a PODification of the spec are in the works."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.51"

RPM_NAME = "perl-XML-SAX-Expat-0.51-4.17.noarch.rpm"
RPM_HASH = "851771515850ba70661ed8fac6c02aa13fc4465ef00ef89e1cf7f36403a98ddcd28a0b5e62ebc12ad9ac75d3146318b85c7c8d6e1ad752363e8e195f40a2e8bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--SAX--Expat \
perl-XML-SAX-Expat"

RDEPENDS:${PN} += "/usr/bin/sh \
perl--MODULE-COMPAT-5.36.1 \
perl-XML--NamespaceSupport \
perl-XML--Parser \
perl-XML--SAX \
perl-XML--SAX--Base"

inherit rpm
