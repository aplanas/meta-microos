SUMMARY = "The PipeWire SPA Tools"
DESCRIPTION = "SPA or Simple Plugin API is a plugin API. \
 \
This package provides spa-inspect and spa-monitor tools."
LICENSE = "MIT"

PV = "0.3.72"

RPM_NAME = "pipewire-spa-tools-0.3.72-1.1.aarch64.rpm"
RPM_HASH = "82c745ff3dbb42a7232ad98d91f2c6e8ab9731b6abf572d667cc12ecaeca9e4fbc2d1d93650a088d94bef556f1fc364bf641e696766a7bfe42abf9eb1ba9137d"

RPROVIDES:${PN} += "pipewire-spa-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libm.so.6 \
libsndfile.so.1"

inherit rpm
