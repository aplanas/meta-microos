SUMMARY = "Thin Python bindings to de/compression algorithms in Rust"
DESCRIPTION = "Extremely thin Python bindings to de/compression algorithms in Rust. \
Allows for using algorithms such as Snappy, without any system dependencies."
LICENSE = "MIT"

PV = "2.6.2"

RPM_NAME = "python39-cramjam-2.6.2-1.5.aarch64.rpm"
RPM_HASH = "b2c499226b562a4c92759e5aca72df39442cc79982f332a38b1196609042dc9843353ee9d7a99655f0df67af0fe698479de11ec8d97ae03796b33f49bff12a5a"

RPROVIDES:${PN} += "python3.9dist-cramjam \
python39-cramjam \
python3dist-cramjam"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi"

inherit rpm
