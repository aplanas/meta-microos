SUMMARY = "The PipeWire SPA Tools"
DESCRIPTION = "SPA or Simple Plugin API is a plugin API. \
 \
This package provides spa-inspect and spa-monitor tools."
LICENSE = "MIT"

PV = "0.3.76"

RPM_NAME = "pipewire-spa-tools-0.3.76-1.1.aarch64.rpm"
RPM_HASH = "47a3a9cc54d08436b1fba02b7b445cbc0ff9b6a9393fc794d29b2df01104e18f2d7ae9969a8a2cd6a77dc54dcd9bf3f83d15c42f7020a66da3b11ddc35adde49"

RPROVIDES:${PN} += "pipewire-spa-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libm.so.6 \
libsndfile.so.1"

inherit rpm
