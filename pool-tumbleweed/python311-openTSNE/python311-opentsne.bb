SUMMARY = "Extensible, parallel implementations of t-SNE"
DESCRIPTION = "Extensible, parallel implementations of t-SNE"
LICENSE = "BSD-3-Clause"

PV = "0.6.2"

RPM_NAME = "python311-openTSNE-0.6.2-1.11.aarch64.rpm"
RPM_HASH = "383eb136c938b6ba144da0d48d9b7689e27cdf804fa249de9f671ca9395a263cbc669e699da6e91c64b683ad3a9f1e27fa33603f6b234dee76f87faa50ba7df7"

RPROVIDES:${PN} += "python3-fastTSNE \
python3-openTSNE \
python3.11dist-opentsne \
python311-fastTSNE \
python311-openTSNE \
python3dist-opentsne"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python311-numpy \
python311-scikit-learn \
python311-scipy"

inherit rpm
