SUMMARY = "Read and write PDFs with Python, powered by qpdf"
DESCRIPTION = "Read and write PDFs with Python, powered by qpdf."
LICENSE = "MPL-2.0"

PV = "8.2.1"

RPM_NAME = "python39-pikepdf-8.2.1-1.1.aarch64.rpm"
RPM_HASH = "9ae29142c643524b34ed4a8fea8ee105d953bdd0836a31cdda593d4c9b96ea1a6153d286afa4ec1775b60b0115949671dc1e2c5d6839ec9f638c108c064d5f8b"

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
