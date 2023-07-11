SUMMARY = "Louvain algorithm for community detection"
DESCRIPTION = "This module implements community detection. \
 \
It uses the louvain method described in Fast unfolding of \
communities in large networks, Vincent D Blondel, Jean-Loup \
Guillaume, Renaud Lambiotte, Renaud Lefebvre, Journal of \
Statistical Mechanics: Theory and Experiment 2008(10), P10008 (12pp)"
LICENSE = "BSD-3-Clause"

PV = "0.16"

RPM_NAME = "python39-python-louvain-0.16-1.7.noarch.rpm"
RPM_HASH = "4890a94399370a3243a71472bf61bc33964330bda6cbab2568d167b93fee545ea408b0b63b065664ea66ed15818ae53b478a592dd4f4a336debfb2c459c41f1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-louvain \
python39-python-louvain \
python3dist-python-louvain"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-networkx \
python39-numpy \
update-alternatives"

inherit rpm
