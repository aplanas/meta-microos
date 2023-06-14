SUMMARY = "Low Complexity Communication Codec (LC3) - Shared library"
DESCRIPTION = "Low Complexity Communication Codec (LC3). \
The LC3 is an low latency audio codec. \
 \
This package provides the shared library of liblc3."
LICENSE = "Apache-2.0"

PV = "1.0.3"

RPM_NAME = "liblc3-1-1.0.3-1.1.aarch64.rpm"
RPM_HASH = "43dd7e8fc656faa84f220f992ef4f7d6cb911b51ab535cfff7181d79dcfdcef59cc6819932c24843914025917a230f1e6e6294e768d80a790217db8afc0738bc"

RPROVIDES:${PN} += "liblc3-1 \
liblc3.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
