SUMMARY = "Synthesis ToolKit in C++"
DESCRIPTION = "The Synthesis ToolKit in C++ (STK) is a set of audio signal \
processing and algorithmic synthesis classes. STK facilitates \
development of music synthesis and audio processing software, \
focusing on realtime control and example code. STK is \
user-extensible."
LICENSE = "MIT"

PV = "4.6.2"

RPM_NAME = "libstk4.6.2-4.6.2-1.4.aarch64.rpm"
RPM_HASH = "b87cd08feb71956bc871611c96cef5b19538c1caee51651ef19b5bb83fb5505635fc18dd5fd399a661a1bdbf45f28cb5048501a871f98bdbd3c0fc5c111153fd"

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
