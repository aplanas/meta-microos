SUMMARY = "Multicore version of t-SNE algorithm"
DESCRIPTION = "This is a multicore modification of Barnes-Hut t-distributed \
Stochastic Neighbor Embedding (t-SNE). It is implemented using Python \
and Torch CFFI-based wrappers."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "python310-MulticoreTSNE-0.1-5.5.aarch64.rpm"
RPM_HASH = "313dc28d669a2ddb5f042455a6ab7dfa286319b48ed1c9314b8fe91222cf993de8f4fab7908c287f81d541a99939686a15086bc3f0099d8f47d1b1cedd31f912"

RPROVIDES:${PN} += "libtsne-multicore.so \
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
