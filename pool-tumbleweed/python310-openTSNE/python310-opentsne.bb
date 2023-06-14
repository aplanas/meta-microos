SUMMARY = "Extensible, parallel implementations of t-SNE"
DESCRIPTION = "Extensible, parallel implementations of t-SNE"
LICENSE = "BSD-3-Clause"

PV = "0.6.2"

RPM_NAME = "python310-openTSNE-0.6.2-1.9.aarch64.rpm"
RPM_HASH = "0ff6bc66b830d913e1a5196e54be9da9c89b018b054fd432084307308187cd2125e43959ec47e2d150367286b7d163977a9cc2b419488d4349e065e96b924552"

RPROVIDES:${PN} += "python3-fastTSNE \
python3-openTSNE \
python3.10dist-opentsne \
python310-fastTSNE \
python310-openTSNE \
python3dist-opentsne"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python310-numpy \
python310-scikit-learn \
python310-scipy"

inherit rpm
