SUMMARY = "Support daemon for hardware random device"
DESCRIPTION = "This  daemon  feeds data from a random number generator to the kernel's \
random  number  entropy  pool,  after	first checking the data to \
ensure that it is properly random."
LICENSE = "GPL-3.0-or-later"

PV = "6.16"

RPM_NAME = "rng-tools-6.16-1.1.aarch64.rpm"
RPM_HASH = "8bb8d0c9c41730f38d4f18d3c1c085a44663bd55440884c1ce99ef750a616aec91127798df47647572316fa7550a1e03dedc74744b8db768b704445006c19dbb"

RPROVIDES:${PN} += "rng-tools"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libcrypto.so.3 \
libp11.so.3 \
opensc \
systemd"

inherit rpm
