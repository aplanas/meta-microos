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

RPM_NAME = "python39-cluster-1.4.1.post2-2.11.noarch.rpm"
RPM_HASH = "1a48bd41f16434c37b15d5b16676e41f3025d558490e291ddd24ce6dbd7625b2db6c435805e6614733386d1337a030767e647c7ec6974cd397890fae88441088"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cluster \
python39-cluster \
python3dist-cluster"

RDEPENDS:${PN} += "python-abi \
python39-matplotlib \
python39-numpy \
python39-scipy"

inherit rpm
