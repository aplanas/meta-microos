SUMMARY = "Read and write PDFs with Python, powered by qpdf"
DESCRIPTION = "Read and write PDFs with Python, powered by qpdf."
LICENSE = "MPL-2.0"

PV = "6.2.8.post1"

RPM_NAME = "python39-pikepdf-6.2.8.post1-1.3.aarch64.rpm"
RPM_HASH = "25ee16765d50e99a773374126a242253447756c630ccd10584a83bcb8d5d771e8d95fc844fdb295ea39e30cbd35f9c858f3a9737038ea140e6593faed434afb0"

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
