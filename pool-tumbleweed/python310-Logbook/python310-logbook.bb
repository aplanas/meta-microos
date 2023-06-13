SUMMARY = "A logging replacement for Python"
DESCRIPTION = "An alternative logging implementation for python."
LICENSE = "BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "python310-Logbook-1.5.3-3.12.aarch64.rpm"
RPM_HASH = "73ad2f28ba91b2a1d705c74edb42150b0034073dc0aa0b2391b5dbb7a9a74dfb836b5d338f5568d018578a41c2bde8c0391028dd4cf4b0f4b0ecb0471ff34e3d"

RPROVIDES:${PN} += "python3-Logbook \
python3.10dist(logbook) \
python310-Logbook \
python310-Logbook(aarch-64) \
python3dist(logbook)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi)"

inherit rpm
