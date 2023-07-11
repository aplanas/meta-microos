SUMMARY = "Theme Hospital clone"
DESCRIPTION = "This project aims to reimplement the game engine of Theme Hospital, and be \
able to load the original game data files. This means that you will need a \
purchased copy of Theme Hospital, or a copy of the demo, in order to use \
CorsixTH. After most of the original engine has been reimplemented in open \
source code, the project will serve as a base from which extensions and \
improvements to the original game can be made."
LICENSE = "MIT"

PV = "0.66"

RPM_NAME = "CorsixTH-0.66-1.8.aarch64.rpm"
RPM_HASH = "c003054b204c052dd6f64db3c3476d40695ed591fb8dcde68255fd3258ef358d9ec55edb8966545cf2b6d484eeb3d8a016e4b06318505544e494d7e1e7487b14"

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
