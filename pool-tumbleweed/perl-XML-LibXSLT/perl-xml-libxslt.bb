SUMMARY = "Interface to GNOME libxslt library"
DESCRIPTION = "This module is an interface to the GNOME project's libxslt. This is an \
extremely good XSLT engine, highly compliant and also very fast. I have \
tests showing this to be more than twice as fast as Sablotron."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.002001"

RPM_NAME = "perl-XML-LibXSLT-2.002001-1.4.aarch64.rpm"
RPM_HASH = "fc98b97648a7dc0367d1076929003e1553846858abac8a4554e7995482d784963b445bff5bc5bf95743fcb27252f8de6ebd2caa2ae61b0409289d2fe768876da"

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
perl--MODULE-COMPAT-5.38.0 \
perl-File--Path \
perl-XML--LibXML"

inherit rpm
