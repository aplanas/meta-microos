SUMMARY = "Louvain algorithm for community detection"
DESCRIPTION = "This module implements community detection. \
 \
It uses the louvain method described in Fast unfolding of \
communities in large networks, Vincent D Blondel, Jean-Loup \
Guillaume, Renaud Lambiotte, Renaud Lefebvre, Journal of \
Statistical Mechanics: Theory and Experiment 2008(10), P10008 (12pp)"
LICENSE = "BSD-3-Clause"

PV = "0.16"

RPM_NAME = "python310-python-louvain-0.16-1.5.noarch.rpm"
RPM_HASH = "5ae3eea5ca3d917db3437a31028e15e9dd72e248aa7c606d79e951992c947189aef914f5725f41885da25b74eaa46288d65bde64d995c4f6015f084261399403"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-louvain \
python3.10dist-python-louvain \
python310-python-louvain \
python3dist-python-louvain"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-networkx \
python310-numpy \
update-alternatives"

inherit rpm
