SUMMARY = "Complete Color Management Solution Geared Towards Motion Picture Production"
DESCRIPTION = "OpenColorIO (OCIO) is a color management solution geared towards motion picture \
production with an emphasis on visual effects and computer animation. \
 \
OCIO is compatible with the Academy Color Encoding Specification (ACES) and is \
LUT-format agnostic, supporting many popular formats."
LICENSE = "BSD-3-Clause"

PV = "2.1.2"

RPM_NAME = "libOpenColorIO2_1-2.1.2-3.2.aarch64.rpm"
RPM_HASH = "71deaf252bbbd861ef2657305dc60fe741a2b6cd0bd5953e3d9d1ac7af9fe34ff597b9df0b21f35313d8b2ed1581450bd7fa6cbb09a3d5f0923503764f84d4d9"

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
