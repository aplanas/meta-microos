SUMMARY = "Utilities for OpenSAML library"
DESCRIPTION = "OpenSAML is an open source implementation of the OASIS Security Assertion \
Markup Language Specification. It contains a set of open source C++ classes \
that support the SAML 1.0, 1.1, and 2.0 specifications. \
 \
This package contains the utility programs."
LICENSE = "Apache-2.0"

PV = "3.2.1"

RPM_NAME = "opensaml-bin-3.2.1-1.11.aarch64.rpm"
RPM_HASH = "e5708896b85b9bef65567ba37ebb28e757bfee8ff1eabfda67b354a31d69f26783b0d172f32cfc9795f0709cb04a6e1e0e2eac7586ba476fe63a082f4491c44f"

RPROVIDES:${PN} += "opensaml-bin \
opensaml-bin(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
liblog4shib.so.2()(64bit) \
libsaml.so.12()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libxerces-c-3.2.so()(64bit) \
libxmltooling.so.10()(64bit)"

inherit rpm
