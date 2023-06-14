SUMMARY = "Extensible, parallel implementations of t-SNE"
DESCRIPTION = "Extensible, parallel implementations of t-SNE"
LICENSE = "BSD-3-Clause"

PV = "0.6.2"

RPM_NAME = "python39-openTSNE-0.6.2-1.9.aarch64.rpm"
RPM_HASH = "8adbff3ac0d1e6a84d9a5c31529fe196f6b015c5292daa123b11646d1f9b4fd64ad4ab54ac47cb6370d8fa124a7702c2ada27466d3e01efcabadb497b87cd30c"

RPROVIDES:${PN} += "python3.9dist-opentsne \
python39-fastTSNE \
python39-openTSNE \
python3dist-opentsne"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python39-numpy \
python39-scikit-learn \
python39-scipy"

inherit rpm
