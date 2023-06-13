SUMMARY = "LADSPA MCP-plugins"
DESCRIPTION = "This package provides a set of audio plugins for LADSPA \
(Linux Audio Developer's Simple Plug-in API) by Fons Adriaensen, \
including moog VCF, chrous and phaser effects."
LICENSE = "GPL-2.0+"

PV = "0.4.0"

RPM_NAME = "ladspa-MCP-0.4.0-4.26.aarch64.rpm"
RPM_HASH = "6d37c35d1413a10ca799e69236ff85cbaa9d7ef1468559c787e6752c76c948241ec6ffb3adf26ec397e50fe8578836f6b2699ba8757c8bbe1d4ad26de4ea3e87"

RPROVIDES:${PN} += "ladspa-MCP \
ladspa-MCP(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
