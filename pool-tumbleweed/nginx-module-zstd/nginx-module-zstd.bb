SUMMARY = "NGINX module for Zstandard compression"
DESCRIPTION = "This is a nginx module to enable Zstd (de)compression on HTTP streams. \
 \
Zstd, short for Zstandard, is a lossless compression algorithm. Speed \
vs. compression trade-off is configurable in small increments."
LICENSE = "BSD-2-Clause"

PV = "0~g23"

RPM_NAME = "nginx-module-zstd-0~g23-1.3.aarch64.rpm"
RPM_HASH = "8f94a77264347cabcb930944018d50c4fc12bb60845ad5af3be732f4700644692578d441543a978fafbd2dee112a177f5ba80f8a0bb9974a4fc7d37ab9118b7f"

RPROVIDES:${PN} += "nginx-module-zstd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzstd.so.1 \
nginx"

inherit rpm
