SUMMARY = "Extensible, parallel implementations of t-SNE"
DESCRIPTION = "Extensible, parallel implementations of t-SNE"
LICENSE = "BSD-3-Clause"

PV = "0.6.2"

RPM_NAME = "python310-openTSNE-0.6.2-1.11.aarch64.rpm"
RPM_HASH = "8e3414ed735a47a3d769901eb3eff01a4ad8644d8557050fb125db2c70d3a31c71f33104246969d0abb2808e0c3489d70f681511c2c848ae9fea0e44d99be057"

RPROVIDES:${PN} += "python3.10dist-opentsne \
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
