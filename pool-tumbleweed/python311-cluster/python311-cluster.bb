SUMMARY = "Clustering library for python"
DESCRIPTION = "The python-cluster package allows you to create several groups \
(clusters) of objects from a list. It’s meant to be flexible and able \
to cluster any object. To ensure this kind of flexibility, you need \
not only to supply the list of objects, but also a function that \
calculates the similarity between two of those objects. For simple \
datatypes, like integers, this can be as simple as a subtraction, but \
more complex calculations are possible. Right now, it is possible to \
generate the clusters using a hierarchical clustering and the popular \
K-Means algorithm. For the hierarchical algorithm there are different \
“linkage” (single, complete, average and uclus) methods available."
LICENSE = "LGPL-2.0-or-later"

PV = "1.4.1.post2"

RPM_NAME = "python311-cluster-1.4.1.post2-2.11.noarch.rpm"
RPM_HASH = "48be109a4af35a60972bc0ac7ab8f548bf03aa240a70313dd7c8a67e7af9f2441de12f310c225991317a56e00656d03f5f62e864e6cf025f98bcd03ca92ce5d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cluster \
python3.11dist-cluster \
python311-cluster \
python3dist-cluster"

RDEPENDS:${PN} += "python-abi \
python311-matplotlib \
python311-numpy \
python311-scipy"

inherit rpm
