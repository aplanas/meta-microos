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

RPM_NAME = "python310-cluster-1.4.1.post2-2.10.noarch.rpm"
RPM_HASH = "0f4e3026c5568ec60caf6adeefad5bc14a5497b863af7b2dbfc41062ae5092ffef5f8dfa1c7f0aaec651d676b00a2e92d9fa0e89b64ed078664d34eb4b86ec34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cluster \
python310-cluster \
python3dist-cluster"

RDEPENDS:${PN} += "python-abi \
python310-matplotlib \
python310-numpy \
python310-scipy"

inherit rpm
