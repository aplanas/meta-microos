SUMMARY = "Multicore version of t-SNE algorithm"
DESCRIPTION = "This is a multicore modification of Barnes-Hut t-distributed \
Stochastic Neighbor Embedding (t-SNE). It is implemented using Python \
and Torch CFFI-based wrappers."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "python311-MulticoreTSNE-0.1-5.4.aarch64.rpm"
RPM_HASH = "aa8dbfc25cf5e71e4aafb8526537ec45417965ed042a452a0d9bea5d070983d94fb92b3b90fd026c55a9dfc34b19d514f0780b4e7463f1b2b33d1d3644c1d5ca"

RPROVIDES:${PN} += "libtsne_multicore.so()(64bit) \
python3.11dist(multicoretsne) \
python311-MulticoreTSNE \
python311-MulticoreTSNE(aarch-64) \
python3dist(multicoretsne)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python311-cffi \
python311-numpy"

inherit rpm
