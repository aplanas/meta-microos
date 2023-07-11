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

RPM_NAME = "python311-cluster-1.4.1.post2-2.10.noarch.rpm"
RPM_HASH = "457502b43b4b6881a63972fed92bd8acd6205921de0255f5cf99fd961a3a9378c194fc0482712453ea404b648134f85c961195f432bbba33418aa2ea65e53279"
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
