SUMMARY = "Python CFFI bindings to the Brotli library"
DESCRIPTION = "Python CFFI bindings to the Brotli library"
LICENSE = "MIT"

PV = "1.0.9.2"

RPM_NAME = "python310-brotlicffi-1.0.9.2-2.1.aarch64.rpm"
RPM_HASH = "db3250d62716fb0944985d5f987fd6fb601406f84c87794089638675fd8bdd45a2de195259143327e35c9235dd476296fec67cd3d51b3d61ae3a4f6cb80edf48"

RPROVIDES:${PN} += "python3.10dist-brotlicffi \
python310-brotlicffi \
python3dist-brotlicffi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-cffi"

inherit rpm
