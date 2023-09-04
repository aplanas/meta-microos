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

RPM_NAME = "perl-XML-SAX-Expat-0.51-4.18.noarch.rpm"
RPM_HASH = "36c467e1899b22cb70ea3007d9490d83f761345e50a024b04561865c0cef301c775775e0b85779e4aedb6b23012b357c7cfd39b4c07b5ec2181e44d0a54c115a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--SAX--Expat \
perl-XML-SAX-Expat"

RDEPENDS:${PN} += "/usr/bin/sh \
perl--MODULE-COMPAT-5.38.0 \
perl-XML--NamespaceSupport \
perl-XML--Parser \
perl-XML--SAX \
perl-XML--SAX--Base"

inherit rpm
