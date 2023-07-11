SUMMARY = "Extensible, parallel implementations of t-SNE"
DESCRIPTION = "Extensible, parallel implementations of t-SNE"
LICENSE = "BSD-3-Clause"

PV = "0.6.2"

RPM_NAME = "python39-openTSNE-0.6.2-1.11.aarch64.rpm"
RPM_HASH = "76c4b284cbf22f9c329f4377de37d3ffa7046238685727549de79bef94997c94e423bcb746ed52cacd4805344ae9691504af4c3f9fa00e434ae13767217d766f"

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
