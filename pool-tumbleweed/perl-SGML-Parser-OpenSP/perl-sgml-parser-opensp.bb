SUMMARY = "Perl interface to the OpenSP SGML and XML parser"
DESCRIPTION = "SGML::Parser::OpenSP provides a native Perl interface, written in C++ \
and XS, to the OpenSP SGML and XML parser. \
 \
 Authors:	Bjoern Hoehrmann, <bjoern@hoehrmann.de>"
LICENSE = "Artistic-1.0 | GPL-2.0+"

PV = "0.994"

RPM_NAME = "perl-SGML-Parser-OpenSP-0.994-7.37.aarch64.rpm"
RPM_HASH = "c6cb4efcdf2764ef79e8bc359cdf98fab2a088f03971a0ae80562dfaee29f79dc4d0c7cc6470a36dc063fe5220b5bcbbccdd607bafd52a25911caca11df1170d"

RPROVIDES:${PN} += "perl-SGML--Parser--OpenSP \
perl-SGML--Parser--OpenSP--Tools \
perl-SGML-Parser-OpenSP"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libosp.so.5 \
libstdc++.so.6 \
perl--MODULE-COMPAT-5.36.1 \
perl-Class--Accessor"

inherit rpm
