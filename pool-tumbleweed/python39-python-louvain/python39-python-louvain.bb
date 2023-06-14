SUMMARY = "Louvain algorithm for community detection"
DESCRIPTION = "This module implements community detection. \
 \
It uses the louvain method described in Fast unfolding of \
communities in large networks, Vincent D Blondel, Jean-Loup \
Guillaume, Renaud Lambiotte, Renaud Lefebvre, Journal of \
Statistical Mechanics: Theory and Experiment 2008(10), P10008 (12pp)"
LICENSE = "BSD-3-Clause"

PV = "0.16"

RPM_NAME = "python39-python-louvain-0.16-1.5.noarch.rpm"
RPM_HASH = "5a49b71a6ba9ad7ffbc00260223c42bf9c3670883421c9fef7f78e50e47b77a0d1fec173d565bac8237f3790850eb79ea76a35e2039aec6ff81cc974e507e461"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-louvain \
python39-python-louvain \
python3dist-python-louvain"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-networkx \
python39-numpy \
update-alternatives"

inherit rpm
