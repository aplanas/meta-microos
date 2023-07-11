SUMMARY = "Read and write PDFs with Python, powered by qpdf"
DESCRIPTION = "Read and write PDFs with Python, powered by qpdf."
LICENSE = "MPL-2.0"

PV = "6.2.8.post1"

RPM_NAME = "python311-pikepdf-6.2.8.post1-1.3.aarch64.rpm"
RPM_HASH = "3842075627b47a328c42dba7a908a1e67e2d4a6a145304d75564b1a7aa5b7ec6db51954ae207f5e270f0cac82233115900af463d49275591e98d94c59bd1a354"

RPROVIDES:${PN} += "python3-pikepdf \
python3.11dist-pikepdf \
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
