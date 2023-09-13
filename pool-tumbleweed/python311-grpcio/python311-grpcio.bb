SUMMARY = "HTTP/2-based Remote Procedure Call implementation"
DESCRIPTION = "gRPC is a remote procedure call (RPC) framework. gRPC enables client \
and server applications to communicate, and enables the building of \
connected systems."
LICENSE = "Apache-2.0"

PV = "1.57.0"

RPM_NAME = "python311-grpcio-1.57.0-1.2.aarch64.rpm"
RPM_HASH = "dc6bd5f8bbebed5b28a8f08661f4a1e7717f72f6743fc9d378c1773fd17943c5be15a2d33ce21d9b75828d02b3e0302ffa0c638202910efba1b2a7c600d6a8a6"

RPROVIDES:${PN} += "python3-grpcio \
python3.11dist-grpcio \
python311-grpcio \
python3dist-grpcio"

RDEPENDS:${PN} += "ca-certificates \
ld-linux-aarch64.so.1 \
libabsl-cord.so.2308.0.0 \
libabsl-cordz-info.so.2308.0.0 \
libabsl-flags-internal.so.2308.0.0 \
libabsl-flags-marshalling.so.2308.0.0 \
libabsl-flags-reflection.so.2308.0.0 \
libabsl-hash.so.2308.0.0 \
libabsl-random-internal-pool-urbg.so.2308.0.0 \
libabsl-random-internal-randen-hwaes-impl.so.2308.0.0 \
libabsl-random-internal-randen-slow.so.2308.0.0 \
libabsl-random-internal-randen.so.2308.0.0 \
libabsl-raw-hash-set.so.2308.0.0 \
libabsl-spinlock-wait.so.2308.0.0 \
libabsl-status.so.2308.0.0 \
libabsl-statusor.so.2308.0.0 \
libabsl-str-format-internal.so.2308.0.0 \
libabsl-strings.so.2308.0.0 \
libabsl-synchronization.so.2308.0.0 \
libabsl-time-zone.so.2308.0.0 \
libabsl-time.so.2308.0.0 \
libc.so.6 \
libcares.so.2 \
libcrypto.so.3 \
libm.so.6 \
libre2.so.11 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1 \
python-abi"

inherit rpm
