SUMMARY = "Osl library"
DESCRIPTION = "Open Shading Language (OSL) is a language for programmable shading \
in advanced renderers and other applications, ideal for describing \
materials, lights, displacement, and pattern generation."
LICENSE = "BSD-3-Clause"

PV = "1.12.10.0"

RPM_NAME = "libtestshade1_12-1.12.10.0-2.1.aarch64.rpm"
RPM_HASH = "4af2df1a8920a4d2f4809e2e2f3044dca2803d9e4fc6e3a7aac3b772077353cbdd36c4c080123fae2945ebc125ded8f9e84ca10e87b7063029e7c17bb2336649"

RPROVIDES:${PN} += "libtestshade.so.1.12 \
libtestshade1-12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOpenImageIO-Util.so.2.4 \
libOpenImageIO.so.2.4 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
liboslexec.so.1.12 \
liboslquery.so.1.12 \
libstdc++.so.6"

inherit rpm
