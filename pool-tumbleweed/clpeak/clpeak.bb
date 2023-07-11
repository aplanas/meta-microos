SUMMARY = "Find peak OpenCL capacities like bandwidth & compute"
DESCRIPTION = "A tool which profiles OpenCL devices to find their peak capacities like \
bandwidth & compute."
LICENSE = "SUSE-Public-Domain"

PV = "1.1.2"

RPM_NAME = "clpeak-1.1.2-1.2.aarch64.rpm"
RPM_HASH = "fc621175bd4e1e891ae4f65459915c0ece576d2e7e6afd9e329ff06c9ed2dc5979237c998b7d52ec9d0b86b243db22858e11cc84cee7ae6924a289473c09e846"

RPROVIDES:${PN} += "clpeak"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libOpenCL.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
