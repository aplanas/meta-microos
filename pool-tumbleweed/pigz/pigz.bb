SUMMARY = "Multi-core gzip version"
DESCRIPTION = "A parallel implementation of gzip for modern multi-processor, multi-core machines"
LICENSE = "Zlib"

PV = "2.7"

RPM_NAME = "pigz-2.7-1.8.aarch64.rpm"
RPM_HASH = "db40d9b863314382fa67031e7d44dd55889373d032bae076a030114e63f3aaf08b148629d86df2a927e5ff62802ddf4914722fe3c965305c9815cb186af4c848"

RPROVIDES:${PN} += "pigz"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6 \
libz.so.1"

inherit rpm
