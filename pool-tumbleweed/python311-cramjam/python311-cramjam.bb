SUMMARY = "Thin Python bindings to de/compression algorithms in Rust"
DESCRIPTION = "Extremely thin Python bindings to de/compression algorithms in Rust. \
Allows for using algorithms such as Snappy, without any system dependencies."
LICENSE = "MIT"

PV = "2.6.2"

RPM_NAME = "python311-cramjam-2.6.2-1.7.aarch64.rpm"
RPM_HASH = "e7a3a1def288201d302075ba716021c420ddd325a0a068e813088457fee15eb56768acd9bf0109573421236853c13bd8f0b0df27a1bb0f653d3d99c55a04aac2"

RPROVIDES:${PN} += "python3-cramjam \
python3.11dist-cramjam \
python311-cramjam \
python3dist-cramjam"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi"

inherit rpm
