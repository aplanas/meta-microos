SUMMARY = "W3C XML schema to C++ data binding compiler"
DESCRIPTION = "CodeSynthesis XSD is an open-source, cross-platform W3C XML Schema to \
C++ data binding compiler. Provided with an XML instance specification \
(XML Schema), it generates C++ classes that represent the given \
vocabulary as well as parsing and serialization code. \
You can then access the data stored in XML using types and functions \
that semantically correspond to your application domain rather than \
dealing with intricacies of reading and writing XML."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "4.1.0"

RPM_NAME = "xsd-4.1.0-1.13.aarch64.rpm"
RPM_HASH = "2edfef22c9485530c40a45378ed2395e33c70059393378e2662faeb2a02eabf1d5d9da78ef8d08c1c790cf0e43a005286929194a69d0c14e6990e7b793d4b3a7"

RPROVIDES:${PN} += "xsd \
xsd(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libxerces-c-3.2.so()(64bit) \
libxerces-c-devel"

inherit rpm
