SUMMARY = "WasmEdge library"
DESCRIPTION = "Library for WasmEdge."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.13.3"

RPM_NAME = "libwasmedge0-0.13.3-1.1.aarch64.rpm"
RPM_HASH = "5a7a9f42ad3d77c1965209128d0f23498556ecb4b0684e5594357783ca95ca7a906dd4ed5b72b8e452a191123e121d4d15bdd535acedc401ae9be71392d09632"

RPROVIDES:${PN} += "libwasmedge.so.0 \
libwasmedge0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfmt.so.9 \
libgcc-s.so.1 \
libm.so.6 \
libspdlog.so.1.12 \
libstdc++.so.6"

inherit rpm
