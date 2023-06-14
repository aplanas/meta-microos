SUMMARY = "A lightweight text editor written in Lua"
DESCRIPTION = "Lite XL is derived from lite. It is a lightweight text editor written mostly in Lua — it aims to provide something practical, pretty, small and fast easy to modify and extend, or to use without doing either. The aim of Lite XL compared to lite is to be more user friendly, improve the quality of font rendering, and reduce CPU usage."
LICENSE = "MIT"

PV = "2.1.1+git20221230.4e272c3"

RPM_NAME = "lite-xl-2.1.1+git20221230.4e272c3-1.3.aarch64.rpm"
RPM_HASH = "58e9cac2935aa4bb5c55681b9be761bc4f3501a4aea5e9aee566a4c898c2dc57ce7d58c6f672223bbae35c51da0c6d8ea8193fe3d7f3c287a1f03bbe04b2cd4a"

RPROVIDES:${PN} += "lite-xl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libfreetype.so.6 \
liblua5.4.so.5 \
libm.so.6 \
libpcre2-8.so.0"

inherit rpm
