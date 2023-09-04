SUMMARY = "NGINX module for Zstandard compression"
DESCRIPTION = "This is a nginx module to enable Zstd (de)compression on HTTP streams. \
 \
Zstd, short for Zstandard, is a lossless compression algorithm. Speed \
vs. compression trade-off is configurable in small increments."
LICENSE = "BSD-2-Clause"

PV = "0~g23"

RPM_NAME = "nginx-module-zstd-0~g23-1.4.aarch64.rpm"
RPM_HASH = "d60eb24dc959d84f67faf09bab985f3aee061f07425ebc9a65834128fad8479368016783d9b7f923ecb9f6244bd555fb52bbb73a1745182d4277558cac072d29"

RPROVIDES:${PN} += "nginx-module-zstd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzstd.so.1 \
nginx"

inherit rpm
