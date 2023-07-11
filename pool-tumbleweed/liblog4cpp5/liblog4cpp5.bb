SUMMARY = "Logging for C++"
DESCRIPTION = "Logging facilities providing library."
LICENSE = "LGPL-2.1-only"

PV = "1.1.3"

RPM_NAME = "liblog4cpp5-1.1.3-2.20.aarch64.rpm"
RPM_HASH = "621ade93d3265c009d35d61ef74e10fd5f1322482f8517371a4ac2d501d13ef2459a801e2ebbc26b8d9924a4872091b395b04ac130e1928b9325e0c35c2db586"

RPROVIDES:${PN} += "liblog4cpp.so.5 \
liblog4cpp5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
