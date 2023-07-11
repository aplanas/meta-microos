SUMMARY = "Louvain algorithm for community detection"
DESCRIPTION = "This module implements community detection. \
 \
It uses the louvain method described in Fast unfolding of \
communities in large networks, Vincent D Blondel, Jean-Loup \
Guillaume, Renaud Lambiotte, Renaud Lefebvre, Journal of \
Statistical Mechanics: Theory and Experiment 2008(10), P10008 (12pp)"
LICENSE = "BSD-3-Clause"

PV = "0.16"

RPM_NAME = "python310-python-louvain-0.16-1.7.noarch.rpm"
RPM_HASH = "d46d548594f596b442c1acb6d3bb895fc5b6b18d51662beb3a64b50ef02be23bb0ccd0283e8fd0de5b00e7e588e6f46415afa2cc13db278baff4f1298534d709"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-louvain \
python310-python-louvain \
python3dist-python-louvain"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-networkx \
python310-numpy \
update-alternatives"

inherit rpm
