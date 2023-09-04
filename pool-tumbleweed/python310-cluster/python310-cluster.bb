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

RPM_NAME = "python310-cluster-1.4.1.post2-2.11.noarch.rpm"
RPM_HASH = "ff8b938b4a60a2ce720b89c2745ba22a16789b41d0a9409158eaf500cee1ad5a45ddacd4b21c855835bf5ecd2f8ea8b915c97a6db02892a6f7d19ba202688839"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cluster \
python310-cluster \
python3dist-cluster"

RDEPENDS:${PN} += "python-abi \
python310-matplotlib \
python310-numpy \
python310-scipy"

inherit rpm
