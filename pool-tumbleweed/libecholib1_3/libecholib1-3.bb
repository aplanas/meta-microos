SUMMARY = "EchoLink library"
DESCRIPTION = "EchoLink communications library"
LICENSE = "GPL-2.0-only"

PV = "1.3.2"

RPM_NAME = "libecholib1_3-1.3.2-5.9.aarch64.rpm"
RPM_HASH = "cf0fd60b147de6f7381ecc4a68118b95bae724617a5c1d925f2ba95d08762316f519c61996c8503ac99b567df79d74b7da2ef56620c191fd48106c007af28fa9"

RPROVIDES:${PN} += "libecholib.so.1.3 \
libecholib1-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasyncaudio.so.1.6 \
libasynccore.so.1.6 \
libc.so.6 \
libgcc-s.so.1 \
libgsm.so.1 \
libsigc-2.0.so.0 \
libspeex.so.1 \
libstdc++.so.6"

inherit rpm
