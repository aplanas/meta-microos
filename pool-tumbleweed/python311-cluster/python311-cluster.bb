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

RPM_NAME = "python311-cluster-1.4.1.post2-2.8.noarch.rpm"
RPM_HASH = "cca8318fc486f909055f0d4425e9f54564e8748a488038cb38de8e01149744b65203169bf08088756a361da5d1b41ba3c3caad5d99884584def2c0486117c5a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cluster) \
python311-cluster \
python3dist(cluster)"

RDEPENDS:${PN} += "python(abi) \
python311-matplotlib \
python311-numpy \
python311-scipy"

inherit rpm
