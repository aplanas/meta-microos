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

RPM_NAME = "python310-y-py-0.6.1-1.3.aarch64.rpm"
RPM_HASH = "97499a8658a3d73ee00b198c2873ada55c4b380b9a3eb4aa898dcf07be1e1ff0a69031f314d8cde7cdcf809bf8e93382893c0931c4946fd8d0031c72f4fa85bb"

RPROVIDES:${PN} += "python3.10dist-y-py \
python310-y-py \
python3dist-y-py"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi"

inherit rpm
