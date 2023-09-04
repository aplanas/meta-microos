SUMMARY = "The PipeWire SPA Tools"
DESCRIPTION = "SPA or Simple Plugin API is a plugin API. \
 \
This package provides spa-inspect and spa-monitor tools."
LICENSE = "MIT"

PV = "0.3.77"

RPM_NAME = "pipewire-spa-tools-0.3.77-2.1.aarch64.rpm"
RPM_HASH = "66a20cdde10a261919f77e15782ae526d67d5a3775f33218801216a6011eda6ce6e6f2e5922bd2867280a3ce86f4722b27de6bfe9bfcbcdf96aa630e6c1a6aab"

RPROVIDES:${PN} += "pipewire-spa-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libm.so.6 \
libsndfile.so.1"

inherit rpm
