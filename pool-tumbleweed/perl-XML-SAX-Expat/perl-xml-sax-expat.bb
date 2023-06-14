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

RPM_NAME = "perl-XML-SAX-Expat-0.51-4.16.noarch.rpm"
RPM_HASH = "9b967f6730d2c467af9fa8e8d49d8b2fb1c8d417c7af5e349da981d2c7616f7331def261dede76db955355db5f24e16f7263332dd156125768cf186289cb1389"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--SAX--Expat \
perl-XML-SAX-Expat"

RDEPENDS:${PN} += "/bin/sh \
perl--MODULE-COMPAT-5.36.0 \
perl-XML--NamespaceSupport \
perl-XML--Parser \
perl-XML--SAX \
perl-XML--SAX--Base"

inherit rpm
