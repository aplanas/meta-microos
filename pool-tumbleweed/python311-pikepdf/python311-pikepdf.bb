SUMMARY = "Read and write PDFs with Python, powered by qpdf"
DESCRIPTION = "Read and write PDFs with Python, powered by qpdf."
LICENSE = "MPL-2.0"

PV = "8.2.1"

RPM_NAME = "python311-pikepdf-8.2.1-1.1.aarch64.rpm"
RPM_HASH = "9fd2f2fda0f8f5f755bace261ae6b3ca8c840c50be29f4b4542ff1b8fa9d8bf74c738cf5fba1f65ca1594bd5933a495089d64cb9f41231467fbc3ce9f7361485"

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
