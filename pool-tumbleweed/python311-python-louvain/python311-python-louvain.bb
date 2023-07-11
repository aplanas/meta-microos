SUMMARY = "Louvain algorithm for community detection"
DESCRIPTION = "This module implements community detection. \
 \
It uses the louvain method described in Fast unfolding of \
communities in large networks, Vincent D Blondel, Jean-Loup \
Guillaume, Renaud Lambiotte, Renaud Lefebvre, Journal of \
Statistical Mechanics: Theory and Experiment 2008(10), P10008 (12pp)"
LICENSE = "BSD-3-Clause"

PV = "0.16"

RPM_NAME = "python311-python-louvain-0.16-1.7.noarch.rpm"
RPM_HASH = "f650d1be621c4469e568a39c0fa63477e96cd1ea5cb2c192525cf9395096652d6efdc39263055973e13ec784cf3033666f0d48c74623b4943faa6612336d8f50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-louvain \
python3.11dist-python-louvain \
python311-python-louvain \
python3dist-python-louvain"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-networkx \
python311-numpy \
update-alternatives"

inherit rpm
