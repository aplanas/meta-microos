SUMMARY = "A Portable Interface for Writing Games"
DESCRIPTION = "ClanLib delivers a platform-independent interface for writing games."
LICENSE = "Zlib"

PV = "4.1.0"

RPM_NAME = "clanlib-4.1.0-2.10.aarch64.rpm"
RPM_HASH = "cf6674257ae32abc70eda433b33283ab8a051e30cb6bb815c7ef7e381bbed4cdab57077e238805c40d9fbe08ec9022c81dd00a5711e9faf38af57c7c435c9f4f"

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
