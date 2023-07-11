SUMMARY = "Bogofilter kyotocabinet backend"
DESCRIPTION = "This package contains bogofilter build with the tokyocabinet backend."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.4"

RPM_NAME = "bogofilter-kyotocabinet-1.2.4-15.13.aarch64.rpm"
RPM_HASH = "661cb27df5a7990ff9e83ffd57d597bcd6965671b0fa4a8c6ccfa4f3ab63c1f5cee51967fdbcf95f5f80609abe677e6734cbeef99b85a507d9dc33ce4d43d3ee"

RPROVIDES:${PN} += "bogofilter-backend \
bogofilter-kyotocabinet \
bogofilter-tokyocabinet"

RDEPENDS:${PN} += "/usr/bin/sh \
bogofilter-common \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgsl.so.27 \
libgslcblas.so.0 \
libkyotocabinet.so.16 \
libm.so.6 \
update-alternatives"

inherit rpm
