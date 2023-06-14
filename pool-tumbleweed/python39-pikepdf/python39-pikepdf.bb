SUMMARY = "Read and write PDFs with Python, powered by qpdf"
DESCRIPTION = "Read and write PDFs with Python, powered by qpdf."
LICENSE = "MPL-2.0"

PV = "6.2.8.post1"

RPM_NAME = "python39-pikepdf-6.2.8.post1-1.1.aarch64.rpm"
RPM_HASH = "58f8bef87b1e5be65f296a0870e6e34b09f15ddea9bc9eef2100d4f86f4b6a45ea0111cea4c37b64d1854b3be00f4e2fd1b1dc1523cef1158e6eabc0f5abb763"

RPROVIDES:${PN} += "python3.9dist-pikepdf \
python39-pikepdf \
python3dist-pikepdf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libqpdf.so.29 \
libstdc++.so.6 \
python-abi \
python39-Pillow \
python39-lxml \
python39-packaging"

inherit rpm
