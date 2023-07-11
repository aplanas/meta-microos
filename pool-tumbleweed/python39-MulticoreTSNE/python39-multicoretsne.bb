SUMMARY = "Multicore version of t-SNE algorithm"
DESCRIPTION = "This is a multicore modification of Barnes-Hut t-distributed \
Stochastic Neighbor Embedding (t-SNE). It is implemented using Python \
and Torch CFFI-based wrappers."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "python39-MulticoreTSNE-0.1-5.5.aarch64.rpm"
RPM_HASH = "20b5633d26e0fce27654f619669ff6b9632b123b5527b9c4dc58e0252b6dee82179f880808fca3645308e405ee07e8aa193f2aae7f9e0b0f1c46ae4a9ed254bb"

RPROVIDES:${PN} += "libtsne-multicore.so \
python3.9dist-multicoretsne \
python39-MulticoreTSNE \
python3dist-multicoretsne"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python39-cffi \
python39-numpy"

inherit rpm
