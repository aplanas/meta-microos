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

RPM_NAME = "python39-y-py-0.5.5-1.3.aarch64.rpm"
RPM_HASH = "83985d35f0f027ecd9b1c26e0d2d408b30d6e22cc27966141ed0b33bd678240ece8928c01b69bebb37b898268f7f0bc98227e3d3bed6ae75a9d935ce32fa6746"

RPROVIDES:${PN} += "python3.9dist-y-py \
python39-y-py \
python3dist-y-py"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi"

inherit rpm
