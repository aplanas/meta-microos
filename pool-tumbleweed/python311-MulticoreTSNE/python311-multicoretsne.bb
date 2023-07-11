SUMMARY = "Multicore version of t-SNE algorithm"
DESCRIPTION = "This is a multicore modification of Barnes-Hut t-distributed \
Stochastic Neighbor Embedding (t-SNE). It is implemented using Python \
and Torch CFFI-based wrappers."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "python311-MulticoreTSNE-0.1-5.5.aarch64.rpm"
RPM_HASH = "974b97edaf882610bf09d3b08f8fc94ee340481d748c7609c11ef8283cd04dc64a51a9b3ad3a85d189d7e28641bcc59c3c28a2911533d739838b229e2f3305bf"

RPROVIDES:${PN} += "libtsne-multicore.so \
python3-MulticoreTSNE \
python3.11dist-multicoretsne \
python311-MulticoreTSNE \
python3dist-multicoretsne"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python311-cffi \
python311-numpy"

inherit rpm
