SUMMARY = "EFL based terminal emulator"
DESCRIPTION = "Fast and lightweight terminal emulator using EFL libraries."
LICENSE = "BSD-2-Clause & OFL-1.1"

PV = "1.13.0"

RPM_NAME = "terminology-1.13.0-1.2.aarch64.rpm"
RPM_HASH = "d62230a5ea8118366e6511422791c65f9455e0b16bd460833d744c4b7a23abb68b924b9cf694778c54587a32570d4b13bff4292384011ce93d1b83bbc7d4c038"

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
