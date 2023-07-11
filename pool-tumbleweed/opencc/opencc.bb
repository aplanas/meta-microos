SUMMARY = "Open Chinese Convert"
DESCRIPTION = "OpenCC is an opensource project for conversion between Traditional \
Chinese and Simplified Chinese, which supports phrase-level conversion \
and regional idioms among Mainland China, Taiwan and Hong kong."
LICENSE = "Apache-2.0"

PV = "1.1.6"

RPM_NAME = "opencc-1.1.6-1.4.aarch64.rpm"
RPM_HASH = "d0be345af2efc6a572bc9401c9e77b12109a2e74027ee83d7dcd794e14bc2bda4816c298e801855a33d9cfb79cbfa34dbf991617ed00d7bc8d6483b5a1ddd106"

RPROVIDES:${PN} += "opencc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libopencc.so.1.1 \
libstdc++.so.6"

inherit rpm
