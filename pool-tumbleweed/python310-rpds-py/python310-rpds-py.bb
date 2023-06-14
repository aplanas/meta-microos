SUMMARY = "Python bindings to Rust's persistent data structures (rpds)"
DESCRIPTION = "Python bindings to Rust's persistent data structures (rpds)"
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python310-rpds-py-0.7.1-2.1.aarch64.rpm"
RPM_HASH = "472e25a35d4a5e64f518f9fe61472874f866111bc2c97271f5de9a3bebaefeec62b848e6e15171a63d0a50afe716f1db78b145cbd4464d6a43ab28ec8968e454"

RPROVIDES:${PN} += "python3-rpds-py \
python3.10dist-rpds-py \
python310-rpds-py \
python3dist-rpds-py"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
