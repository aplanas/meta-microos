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

RPM_NAME = "python39-cluster-1.4.1.post2-2.10.noarch.rpm"
RPM_HASH = "1634815630b052c7054f1a1340b46e1dd9200e720309b21ad710cd0e48ab91a74e4ab368df6ccba4ba068e0709cdf402c412bc545b9cad5aa9fa624bc51ca89f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cluster \
python39-cluster \
python3dist-cluster"

RDEPENDS:${PN} += "python-abi \
python39-matplotlib \
python39-numpy \
python39-scipy"

inherit rpm
