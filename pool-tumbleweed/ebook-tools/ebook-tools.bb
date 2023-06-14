SUMMARY = "A library for reading ebook files"
DESCRIPTION = "ebook-tools provides some tools to handle ebook files"
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "ebook-tools-0.2.2-7.1.aarch64.rpm"
RPM_HASH = "176cb66133c742e658c3d7a29abeb2b4468c671f89125c1cf33d58319f5c6594c3289c6ca9b582b04d5f6717914598ecc5ee19f7ccdffb2425eb60e5eba0544a"

RPROVIDES:${PN} += "ebook-tools"

RDEPENDS:${PN} += "/bin/sh \
libc.so.6 \
libepub.so.0"

inherit rpm
