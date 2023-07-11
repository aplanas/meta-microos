SUMMARY = "Python bindings to Rust's persistent data structures (rpds)"
DESCRIPTION = "Python bindings to Rust's persistent data structures (rpds)"
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python310-rpds-py-0.7.1-2.2.aarch64.rpm"
RPM_HASH = "5623d4e34525368f5032d4c5213dd64d5454a04dbf4505771f87e5c13d208ea76d725c9029d149cbb147f2906044995ba15233d752d7336070d4e1846687fa34"

RPROVIDES:${PN} += "python3.10dist-rpds-py \
python310-rpds-py \
python3dist-rpds-py"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
