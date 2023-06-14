SUMMARY = "Synthesis ToolKit in C++"
DESCRIPTION = "The Synthesis ToolKit in C++ (STK) is a set of audio signal \
processing and algorithmic synthesis classes. STK facilitates \
development of music synthesis and audio processing software, \
focusing on realtime control and example code. STK is \
user-extensible."
LICENSE = "MIT"

PV = "4.6.2"

RPM_NAME = "libstk4.6.2-4.6.2-1.3.aarch64.rpm"
RPM_HASH = "8d0ebcc864b7840f22536f6d8dc116d046a7199c960876290f95dcb7b6716f70f6182016ce3813ad8ca17feb011ab8df649e47724cd3d3951cbe464186ec1dde"

RPROVIDES:${PN} += "libstk4.6.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libjack.so.0 \
libm.so.6 \
libstdc++.so.6 \
stk-data"

inherit rpm
