SUMMARY = "A Portable Interface for Writing Games"
DESCRIPTION = "ClanLib delivers a platform-independent interface for writing games."
LICENSE = "Zlib"

PV = "4.1.0"

RPM_NAME = "clanlib-4.1.0-2.11.aarch64.rpm"
RPM_HASH = "08ce8d0fde48544054bd236b6956859641e1b11014ecd3acf1311543bc08d8588c89c18fc382aeb91b0ccf2217bd4cc1404d25b0c41caeb151fcf97c69b18247"

RPROVIDES:${PN} += "clanlib \
libclan41App-4.1.so.1 \
libclan41Core-4.1.so.1 \
libclan41Display-4.1.so.1 \
libclan41GL-4.1.so.1 \
libclan41Network-4.1.so.1 \
libclan41Sound-4.1.so.1 \
libclan41UI-4.1.so.1 \
libclan41XML-4.1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libasound.so.2 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
