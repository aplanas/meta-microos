SUMMARY = "CELT is a very low delay audio codec"
DESCRIPTION = "CELT is a very low delay audio codec designed for high-quality communications. \
Its potential uses include video-conferencing and network music performance. \
 \
This is a maintained branch of the 0.5.1 prerelease of CELT."
LICENSE = "BSD-3-Clause"

PV = "0.5.1.3"

RPM_NAME = "celt051-0.5.1.3-10.30.aarch64.rpm"
RPM_HASH = "693f69cbe1c70c590a548df6fb65cb56f42dfa25e8ddfe444f3d9c40bc1b3a7be23f4e7fae7bd55095fddaf1dacc1b01124cceae4b4a368969f854b4499d4303"

RPROVIDES:${PN} += "celt051"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcelt051.so.0 \
libogg.so.0"

inherit rpm
