SUMMARY = "Theme Hospital clone"
DESCRIPTION = "This project aims to reimplement the game engine of Theme Hospital, and be \
able to load the original game data files. This means that you will need a \
purchased copy of Theme Hospital, or a copy of the demo, in order to use \
CorsixTH. After most of the original engine has been reimplemented in open \
source code, the project will serve as a base from which extensions and \
improvements to the original game can be made."
LICENSE = "MIT"

PV = "0.67"

RPM_NAME = "CorsixTH-0.67-1.1.aarch64.rpm"
RPM_HASH = "6b598769ec6de84970031437bc8df4f8b14d6d130d2708cfd9dcfb377a1b0da9ed0f1490aa9c245bd34f62a972868368e00b1cd9ba1c13f6085088815aa553e6"

RPROVIDES:${PN} += "CorsixTH"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libavcodec.so.60 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
liblua5.4.so.5 \
libm.so.6 \
libstdc++.so.6 \
libswresample.so.4 \
libswscale.so.7 \
lua-lpeg \
lua-luafilesystem"

inherit rpm
