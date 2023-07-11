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

PV = "0.6.1"

RPM_NAME = "python39-y-py-0.6.1-1.3.aarch64.rpm"
RPM_HASH = "f6fefeb0712673d131e5241a0e0a247d20e85c1d1e32f161635c02b75900b6b3c1a1b9573b7aa2849d997fe0e2594ec60c6d55eb9d92132e7a4e126e54d389c4"

RPROVIDES:${PN} += "python3.9dist-y-py \
python39-y-py \
python3dist-y-py"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi"

inherit rpm
