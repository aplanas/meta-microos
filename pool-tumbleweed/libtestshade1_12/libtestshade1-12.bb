SUMMARY = "Osl library"
DESCRIPTION = "Open Shading Language (OSL) is a language for programmable shading \
in advanced renderers and other applications, ideal for describing \
materials, lights, displacement, and pattern generation."
LICENSE = "BSD-3-Clause"

PV = "1.12.10.0"

RPM_NAME = "libtestshade1_12-1.12.10.0-2.1.aarch64.rpm"
RPM_HASH = "4af2df1a8920a4d2f4809e2e2f3044dca2803d9e4fc6e3a7aac3b772077353cbdd36c4c080123fae2945ebc125ded8f9e84ca10e87b7063029e7c17bb2336649"

RPROVIDES:${PN} += "libtestshade.so.1.12()(64bit) \
libtestshade1_12 \
libtestshade1_12(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libOpenImageIO.so.2.4()(64bit) \
libOpenImageIO_Util.so.2.4()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
liboslexec.so.1.12()(64bit) \
liboslquery.so.1.12()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
