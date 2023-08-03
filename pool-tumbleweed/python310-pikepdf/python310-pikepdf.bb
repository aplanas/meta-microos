SUMMARY = "Read and write PDFs with Python, powered by qpdf"
DESCRIPTION = "Read and write PDFs with Python, powered by qpdf."
LICENSE = "MPL-2.0"

PV = "8.2.1"

RPM_NAME = "python310-pikepdf-8.2.1-1.1.aarch64.rpm"
RPM_HASH = "877a2006e36cc117414ab37c83827df98cbd52dbb4d6223d6da2ff13189169b2ea55dd831a26fe13373fcb3ba3e98da00b116f44b20bdee7abed8dead06d1690"

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
