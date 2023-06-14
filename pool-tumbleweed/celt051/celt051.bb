SUMMARY = "CELT is a very low delay audio codec"
DESCRIPTION = "CELT is a very low delay audio codec designed for high-quality communications. \
Its potential uses include video-conferencing and network music performance. \
 \
This is a maintained branch of the 0.5.1 prerelease of CELT."
LICENSE = "BSD-3-Clause"

PV = "0.5.1.3"

RPM_NAME = "celt051-0.5.1.3-10.29.aarch64.rpm"
RPM_HASH = "dd22618211484aeb95304b883a3cc06c2c7e4950f891a9e85f8618463619935a4a42900d6dc9010528c7b07e8759a5ba71c2386e3f1d877cc719944d2783ef9d"

RPROVIDES:${PN} += "celt051"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcelt051.so.0 \
libogg.so.0"

inherit rpm
