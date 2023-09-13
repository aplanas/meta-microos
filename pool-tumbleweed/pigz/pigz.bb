SUMMARY = "Multi-core gzip version"
DESCRIPTION = "A parallel implementation of gzip for modern multi-processor, multi-core machines"
LICENSE = "Zlib"

PV = "2.8"

RPM_NAME = "pigz-2.8-1.1.aarch64.rpm"
RPM_HASH = "e2bc34bc5e2800bb8cddebde2c026c38b42fcbd04066433d67b24edb3efa7affd5d9ce971747906bb87024af66c9bad69c66b9f7d7223426cac4b693c85da71e"

RPROVIDES:${PN} += "pigz"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6 \
libz.so.1"

inherit rpm
