SUMMARY = "A lightweight text editor written in Lua"
DESCRIPTION = "Lite XL is derived from lite. It is a lightweight text editor written mostly in Lua — it aims to provide something practical, pretty, small and fast easy to modify and extend, or to use without doing either. The aim of Lite XL compared to lite is to be more user friendly, improve the quality of font rendering, and reduce CPU usage."
LICENSE = "MIT"

PV = "2.1.1+git20221230.4e272c3"

RPM_NAME = "lite-xl-2.1.1+git20221230.4e272c3-1.4.aarch64.rpm"
RPM_HASH = "82afd5d348fbae17359a2b7b8c2c0a25e37fde8cab1a2044dc9d1538126d95d7049940474eda0bbe2fbf168de1144d8c32c298dbdf9ebdafea468ed6a6fe4091"

RPROVIDES:${PN} += "lite-xl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libfreetype.so.6 \
liblua5.4.so.5 \
libm.so.6 \
libpcre2-8.so.0"

inherit rpm
