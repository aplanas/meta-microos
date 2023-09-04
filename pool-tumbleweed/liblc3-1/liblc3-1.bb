SUMMARY = "Low Complexity Communication Codec (LC3) - Shared library"
DESCRIPTION = "Low Complexity Communication Codec (LC3). \
The LC3 is an low latency audio codec. \
 \
This package provides the shared library of liblc3."
LICENSE = "Apache-2.0"

PV = "1.0.4"

RPM_NAME = "liblc3-1-1.0.4-1.1.aarch64.rpm"
RPM_HASH = "3f245fd7df175dad7d6c924903ac60c32121591807c78a1012af266fe5525fec37925538255e79ec63903fabdf040520fe2e9440e403165b5493cbaa9886f560"

RPROVIDES:${PN} += "liblc3-1 \
liblc3.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
