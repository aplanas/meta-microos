SUMMARY = "Read and write PDFs with Python, powered by qpdf"
DESCRIPTION = "Read and write PDFs with Python, powered by qpdf."
LICENSE = "MPL-2.0"

PV = "6.2.8.post1"

RPM_NAME = "python311-pikepdf-6.2.8.post1-1.1.aarch64.rpm"
RPM_HASH = "66a7a537dfa5752be43d456bb6163ca8b209126037f3f94ffed03b3ff2eecba987d086e8ec033cc7bc5b476685e82ee29ef408de92c8b64c8b23acc6ba7a5ece"

RPROVIDES:${PN} += "python3.11dist-pikepdf \
python311-pikepdf \
python3dist-pikepdf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libqpdf.so.29 \
libstdc++.so.6 \
python-abi \
python311-Pillow \
python311-lxml \
python311-packaging"

inherit rpm
