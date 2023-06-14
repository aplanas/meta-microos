SUMMARY = "Complete Color Management Solution Geared Towards Motion Picture Production"
DESCRIPTION = "OpenColorIO (OCIO) is a color management solution geared towards motion picture \
production with an emphasis on visual effects and computer animation. \
 \
OCIO is compatible with the Academy Color Encoding Specification (ACES) and is \
LUT-format agnostic, supporting many popular formats."
LICENSE = "BSD-3-Clause"

PV = "2.1.2"

RPM_NAME = "libOpenColorIO2_1-2.1.2-3.1.aarch64.rpm"
RPM_HASH = "8ffeb56975743fa7983a7cc21b077bb7325d2536f866826ab0e26999e3ebeb027b110a92bc8023ecdf5fa87a25d9ed35ffe0bb45dded9500fd51702491fec1cd"

RPROVIDES:${PN} += "libOpenColorIO.so.2.1 \
libOpenColorIO2-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libImath-3-1.so.29 \
libc.so.6 \
libexpat.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libpystring.so.0.0 \
libstdc++.so.6 \
libyaml-cpp.so.0.7 \
libyaml-cpp0-7"

inherit rpm
