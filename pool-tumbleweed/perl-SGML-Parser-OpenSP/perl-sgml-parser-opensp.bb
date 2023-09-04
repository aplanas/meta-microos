SUMMARY = "Perl interface to the OpenSP SGML and XML parser"
DESCRIPTION = "SGML::Parser::OpenSP provides a native Perl interface, written in C++ \
and XS, to the OpenSP SGML and XML parser. \
 \
 Authors:	Bjoern Hoehrmann, <bjoern@hoehrmann.de>"
LICENSE = "Artistic-1.0 | GPL-2.0-or-later"

PV = "0.994"

RPM_NAME = "perl-SGML-Parser-OpenSP-0.994-8.1.aarch64.rpm"
RPM_HASH = "12b5ae6b651d37999064ff8d5e965ad05c27a3e2f07e46423878f56b090756a51b81f057979e6c39853a87833fd922a7365b442d33f2538d2296ea9059ef6b86"

RPROVIDES:${PN} += "perl-SGML--Parser--OpenSP \
perl-SGML--Parser--OpenSP--Tools \
perl-SGML-Parser-OpenSP"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libosp.so.5 \
libstdc++.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-Class--Accessor"

inherit rpm
