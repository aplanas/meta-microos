SUMMARY = "EFL based terminal emulator"
DESCRIPTION = "Fast and lightweight terminal emulator using EFL libraries."
LICENSE = "BSD-2-Clause & OFL-1.1"

PV = "1.13.0"

RPM_NAME = "terminology-1.13.0-1.3.aarch64.rpm"
RPM_HASH = "540a19f69d99c21757c20b46f76c5a72681c1f36d0c9fdfcf09e1f1a9501c09c2ae642d412c9bb8c2a0e6bf82d45cad33942f4a929d7291c0a786f6ca3f8946e"

RPROVIDES:${PN} += "terminology"

RDEPENDS:${PN} += "efl \
elementary \
ld-linux-aarch64.so.1 \
libc.so.6 \
libecore-con.so.1 \
libecore-evas.so.1 \
libecore-file.so.1 \
libecore-imf-evas.so.1 \
libecore-imf.so.1 \
libecore-input.so.1 \
libecore-ipc.so.1 \
libecore.so.1 \
libedje.so.1 \
libeet.so.1 \
libefreet.so.1 \
libeina.so.1 \
libelementary.so.1 \
libemotion.so.1 \
libethumb-client.so.1 \
libevas.so.1 \
libm.so.6 \
terminology-theme-dft"

inherit rpm
