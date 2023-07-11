SUMMARY = "Read and write PDFs with Python, powered by qpdf"
DESCRIPTION = "Read and write PDFs with Python, powered by qpdf."
LICENSE = "MPL-2.0"

PV = "6.2.8.post1"

RPM_NAME = "python310-pikepdf-6.2.8.post1-1.3.aarch64.rpm"
RPM_HASH = "2936c6729b13fb57e693df5ac458354f43e91eb90b94a8d3546cdf6921289b0e8d5371e7d9643107d64abe430c2031d2e2a549461757661ff82733ea09e8aaf8"

RPROVIDES:${PN} += "python3.10dist-pikepdf \
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
