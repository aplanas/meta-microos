SUMMARY = "Format manual pages"
DESCRIPTION = "The mandoc utility formats manual pages for display. \
 \
It is split out from the mandoc package as it can be useful \
even without replacing the entire man infrastructure."
LICENSE = "ISC"

PV = "1.14.6"

RPM_NAME = "mandoc-bin-1.14.6-5.1.aarch64.rpm"
RPM_HASH = "8d5d3e8d27bc76359a4ad2aed2ed81a6b3ee479934a5310a6d8fc8f0ab889cb214a37a1529e24d3f8e97506bfc6f15135d6465a17041752fefcb3b6cd6d7fc73"

RPROVIDES:${PN} += "mandoc-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
