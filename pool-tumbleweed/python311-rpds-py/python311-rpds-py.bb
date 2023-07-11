SUMMARY = "Python bindings to Rust's persistent data structures (rpds)"
DESCRIPTION = "Python bindings to Rust's persistent data structures (rpds)"
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python311-rpds-py-0.7.1-2.2.aarch64.rpm"
RPM_HASH = "e913af42124f78a019def13b760ae803f9b4266dda65bb3ffcb18804c21b6189b66a4b67eb66c5af9c72f644d400499b0c0fa451645bf6f57cad5a9cd5b57f08"

RPROVIDES:${PN} += "python3-rpds-py \
python3.11dist-rpds-py \
python311-rpds-py \
python3dist-rpds-py"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
