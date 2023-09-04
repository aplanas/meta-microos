SUMMARY = "High-performance and extensible WebAssembly runtime"
DESCRIPTION = "WasmEdge is a lightweight, high-performance, and extensible WebAssembly runtime \
for cloud native, edge, and decentralized applications. It powers serverless \
apps, embedded functions, microservices, smart contracts, and IoT devices."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.13.3"

RPM_NAME = "wasmedge-0.13.3-1.1.aarch64.rpm"
RPM_HASH = "7eea7064740a52a4046f92c0224009443067b0c7a4817e0a0ad3f59086b8a5f02df4401f6772b125d2b8cd2eb1163649e21401e7084ea07a76ac374cc3bf1e40"

RPROVIDES:${PN} += "wasmedge"

RDEPENDS:${PN} += "libc.so.6 \
libwasmedge.so.0"

inherit rpm
