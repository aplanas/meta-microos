SUMMARY = "Multicore version of t-SNE algorithm"
DESCRIPTION = "This is a multicore modification of Barnes-Hut t-distributed \
Stochastic Neighbor Embedding (t-SNE). It is implemented using Python \
and Torch CFFI-based wrappers."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "python39-MulticoreTSNE-0.1-5.4.aarch64.rpm"
RPM_HASH = "b7dda896da8bbecbccf46f25960a01c0ef5754d4f966177206fafca4d905f1257effb21c38ee50997a2bce45154749eb0bd2c91f9e9398768564212c66850199"

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
