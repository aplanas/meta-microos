SUMMARY = "The OpenJade Group's SGML and XML Parsing Tools"
DESCRIPTION = "The tools in this package provide the ability to manage SGML and XML \
documents. \
 \
This package contains the parser nsgmls and the related programs \
sgmlnorm, spcat, spam, spent, and sgml2xml (previously known as sx). \
Sgml2xml is useful as a tool for converting from SGML to XML, the \
coming WWW standard. \
 \
This package is a fork from James Clark's SP suite."
LICENSE = "MIT"

PV = "1.5.2"

RPM_NAME = "opensp-1.5.2-202.1.aarch64.rpm"
RPM_HASH = "61ee0b8d9ed14deb5127aa0559e8262d18ede0e12eb76a7dded05d5be5323673c970b51f02978736f7cae38c244371a7057d222ee2d3c7b61b4c031d5035387b"

RPROVIDES:${PN} += "OpenSP \
config(opensp) \
libosp.so.5()(64bit) \
opensp \
opensp(aarch-64) \
sp \
sp_libs"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/sgml-register-catalog \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
