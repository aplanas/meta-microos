SUMMARY = "The PipeWire SPA Tools"
DESCRIPTION = "SPA or Simple Plugin API is a plugin API. \
 \
This package provides spa-inspect and spa-monitor tools."
LICENSE = "MIT"

PV = "0.3.79"

RPM_NAME = "pipewire-spa-tools-0.3.79-1.2.aarch64.rpm"
RPM_HASH = "a1b798eecafa10f4b8231a185dde96fd8621fa172e2dfcf18eccb9ed0cae37130bb4c7173af8e81bb94bd881b4d4cfdef33c0e1a5dd5c0ff9f2b954511256b76"

RPROVIDES:${PN} += "pipewire-spa-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libm.so.6 \
libsndfile.so.1"

inherit rpm
