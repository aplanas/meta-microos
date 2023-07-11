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

RPM_NAME = "python311-y-py-0.6.1-1.3.aarch64.rpm"
RPM_HASH = "2a59f4c9362f11306bb31501810a3d88c49303dfcef854844934591c23a5e4fddb6b9f3ed82afade5be3be3b78b1e061c1a51ac795a1f0a08ae6cf753ac893ac"

RPROVIDES:${PN} += "python3-y-py \
python3.11dist-y-py \
python311-y-py \
python3dist-y-py"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi"

inherit rpm
