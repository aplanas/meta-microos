SUMMARY = "The GNU Compiler Undefined Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=undefined option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "12.3.0+git1204"

RPM_NAME = "libubsan1-gcc12-12.3.0+git1204-1.33.aarch64.rpm"
RPM_HASH = "7ff51ce8e42538306311c81d5d844d7648ccc7ad56fcd08bdb3a380dcd78772040a8162af67d16780f002af7b27d77c28457903ea479567cdf57f523d16a2bb1"

RPROVIDES:${PN} += "libubsan.so.1 \
libubsan1 \
libubsan1-gcc12"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
