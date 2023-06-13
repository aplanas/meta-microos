SUMMARY = "Interface to GNOME libxslt library"
DESCRIPTION = "This module is an interface to the GNOME project's libxslt. This is an \
extremely good XSLT engine, highly compliant and also very fast. I have \
tests showing this to be more than twice as fast as Sablotron."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.002001"

RPM_NAME = "perl-XML-LibXSLT-2.002001-1.2.aarch64.rpm"
RPM_HASH = "d15b9cab747881751d993a5edf510292ce9c1468dd033da94a976829d21b1de06f994531a56c9b6c2bd9eb537033e70c0c039f5b511914fd5f0e23b261d324ae"

RPROVIDES:${PN} += "perl(XML::LibXSLT) \
perl(XML::LibXSLT::Quick) \
perl(XML::LibXSLT::Security) \
perl(XML::LibXSLT::StylesheetWrapper) \
perl-XML-LibXSLT \
perl-XML-LibXSLT(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libexslt.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxslt.so.1()(64bit) \
libxslt.so.1(LIBXML2_1.0.11)(64bit) \
libxslt.so.1(LIBXML2_1.0.13)(64bit) \
libxslt.so.1(LIBXML2_1.0.22)(64bit) \
libxslt.so.1(LIBXML2_1.0.24)(64bit) \
libxslt.so.1(LIBXML2_1.0.30)(64bit) \
libxslt.so.1(LIBXML2_1.1.18)(64bit) \
perl(:MODULE_COMPAT_5.36.0) \
perl(File::Path) \
perl(XML::LibXML)"

inherit rpm
