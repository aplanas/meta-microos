SUMMARY = "Complete Color Management Solution Geared Towards Motion Picture Production"
DESCRIPTION = "OpenColorIO (OCIO) is a color management solution geared towards motion picture \
production with an emphasis on visual effects and computer animation. \
 \
OCIO is compatible with the Academy Color Encoding Specification (ACES) and is \
LUT-format agnostic, supporting many popular formats."
LICENSE = "BSD-3-Clause"

PV = "2.1.2"

RPM_NAME = "libOpenColorIO2_1-2.1.2-4.1.aarch64.rpm"
RPM_HASH = "b5fc2a7d0d09ac901572d83e70062999abf4182e8574cb57c168634af29c61cd244dd20989cb35350d84b6c7e9a732496b0d6d47a1c236f465ccb901771174d2"

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
libyaml-cpp.so.0.8 \
libyaml-cpp0-8"

inherit rpm
