SUMMARY = "The PipeWire SPA Tools"
DESCRIPTION = "SPA or Simple Plugin API is a plugin API. \
 \
This package provides spa-inspect and spa-monitor tools."
LICENSE = "MIT"

PV = "0.3.74"

RPM_NAME = "pipewire-spa-tools-0.3.74-1.1.aarch64.rpm"
RPM_HASH = "1e54ce3db5b8ae9537a25eae8a8b60026d8575c0d40e910db4290c09ef5d66a27922c8df9f60ab55d6c84b854a5155150144af55450a6e775e75c28f7dada41c"

RPROVIDES:${PN} += "pipewire-spa-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libm.so.6 \
libsndfile.so.1"

inherit rpm
