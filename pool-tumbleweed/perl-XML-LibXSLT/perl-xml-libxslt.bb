SUMMARY = "Interface to GNOME libxslt library"
DESCRIPTION = "This module is an interface to the GNOME project's libxslt. This is an \
extremely good XSLT engine, highly compliant and also very fast. I have \
tests showing this to be more than twice as fast as Sablotron."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.002001"

RPM_NAME = "perl-XML-LibXSLT-2.002001-1.3.aarch64.rpm"
RPM_HASH = "8e089825332bf546a8534378c7ff96dedf7ae713c3104f41d7426eb5e40d02504c50c307aecb1931211ec18971809f5b7206a371a682163cd29ef5d5409e20f8"

RPROVIDES:${PN} += "perl-XML--LibXSLT \
perl-XML--LibXSLT--Quick \
perl-XML--LibXSLT--Security \
perl-XML--LibXSLT--StylesheetWrapper \
perl-XML-LibXSLT"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexslt.so.0 \
libxml2.so.2 \
libxslt.so.1 \
perl--MODULE-COMPAT-5.36.1 \
perl-File--Path \
perl-XML--LibXML"

inherit rpm
