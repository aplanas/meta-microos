SUMMARY = "Python bindings for the Y-CRDT built from yrs (Rust)"
DESCRIPTION = "Python binding for Y-CRDT. It provides distributed data types that enable \
real-time collaboration between devices. Ypy can sync data with any other \
platform that has a Y-CRDT binding, allowing for seamless cross-domain \
communication. The library is a thin wrapper around Yrs, taking advantage of \
the safety and performance of Rust. \
 \
Project is still experimental. Expect the API to change before a version 1.0 \
stable release."
LICENSE = "MIT"

PV = "0.5.5"

RPM_NAME = "python311-y-py-0.5.5-1.3.aarch64.rpm"
RPM_HASH = "bc6cbce6cb926820838c5f57b434e22059d643855bc55d020fe6392f16a7d9b965da50d02ff315b6cf2f5e69f4f1dbdd7e7f318a9232dfae54118e3ddeb2fb9d"

RPROVIDES:${PN} += "python3.11dist-y-py \
python311-y-py \
python3dist-y-py"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi"

inherit rpm
