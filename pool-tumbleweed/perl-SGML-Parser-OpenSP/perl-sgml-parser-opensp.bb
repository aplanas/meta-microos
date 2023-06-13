SUMMARY = "Perl interface to the OpenSP SGML and XML parser"
DESCRIPTION = "SGML::Parser::OpenSP provides a native Perl interface, written in C++ \
and XS, to the OpenSP SGML and XML parser. \
 \
 Authors:	Bjoern Hoehrmann, <bjoern@hoehrmann.de>"
LICENSE = "Artistic-1.0 | GPL-2.0+"

PV = "0.994"

RPM_NAME = "perl-SGML-Parser-OpenSP-0.994-7.36.aarch64.rpm"
RPM_HASH = "53e1aff2c6252bc318def82b6c1174102c76b5943bff22027257b282981cd8b9d296cdccc3850fdcd1b91e7de144fa5f7fb93ddce0f0a1923b0ab0b7994b7183"

RPROVIDES:${PN} += "perl(SGML::Parser::OpenSP) \
perl(SGML::Parser::OpenSP::Tools) \
perl-SGML-Parser-OpenSP \
perl-SGML-Parser-OpenSP(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libosp.so.5()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
perl(:MODULE_COMPAT_5.36.0) \
perl(Class::Accessor)"

inherit rpm
