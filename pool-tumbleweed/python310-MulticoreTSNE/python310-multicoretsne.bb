SUMMARY = "Multicore version of t-SNE algorithm"
DESCRIPTION = "This is a multicore modification of Barnes-Hut t-distributed \
Stochastic Neighbor Embedding (t-SNE). It is implemented using Python \
and Torch CFFI-based wrappers."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "python310-MulticoreTSNE-0.1-5.4.aarch64.rpm"
RPM_HASH = "5716ffebd9f9a03dd36d6c080b681966d437bcf952b0862376fac10fb4cb6b1e220f26787721b569273ad10cf2f26b2409b55085d5aedad4d03ddc5a24d6c2a4"

RPROVIDES:${PN} += "libtsne-multicore.so \
python3-MulticoreTSNE \
python3.10dist-multicoretsne \
python310-MulticoreTSNE \
python3dist-multicoretsne"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python310-cffi \
python310-numpy"

inherit rpm
