SUMMARY = "EchoLink library"
DESCRIPTION = "EchoLink communications library"
LICENSE = "GPL-2.0-only"

PV = "1.3.2"

RPM_NAME = "libecholib1_3-1.3.2-5.10.aarch64.rpm"
RPM_HASH = "748bfe85112206963c2d4ebe2d32821393623141141bc4711bfe2132c8023294b19a657ad906651e605357df4fa32002f4caa90d184acc496da6ec99a36c6f68"

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
