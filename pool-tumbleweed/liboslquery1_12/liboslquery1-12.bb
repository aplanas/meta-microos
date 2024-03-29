SUMMARY = "Osl library"
DESCRIPTION = "Open Shading Language (OSL) is a language for programmable shading \
in advanced renderers and other applications, ideal for describing \
materials, lights, displacement, and pattern generation."
LICENSE = "BSD-3-Clause"

PV = "1.12.10.0"

RPM_NAME = "liboslquery1_12-1.12.10.0-2.1.aarch64.rpm"
RPM_HASH = "f0e819d7d2b3a3617b144fbacfba3257cb7d6c4f3e0488f0a317d45d6f3068d83862a91d1d87e45745c04f89252aabd1d60f02c50e59e7709236dd5be350df2d"

RPROVIDES:${PN} += "liboslquery.so.1.12 \
liboslquery1-12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOpenImageIO-Util.so.2.4 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
