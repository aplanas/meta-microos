SUMMARY = "Read and write PDFs with Python, powered by qpdf"
DESCRIPTION = "Read and write PDFs with Python, powered by qpdf."
LICENSE = "MPL-2.0"

PV = "6.2.8.post1"

RPM_NAME = "python310-pikepdf-6.2.8.post1-1.1.aarch64.rpm"
RPM_HASH = "12ca241cd2183d03f844350f321fa30d3dbce41dd44853afcee84e8a8f91468bee80795ccf188a0c00fdb25586771f6c675ccf764c384d53e492341b733e9564"

RPROVIDES:${PN} += "python3-pikepdf \
python3.10dist-pikepdf \
python310-pikepdf \
python3dist-pikepdf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libqpdf.so.29 \
libstdc++.so.6 \
python-abi \
python310-Pillow \
python310-lxml \
python310-packaging"

inherit rpm
