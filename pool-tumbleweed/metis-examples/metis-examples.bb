SUMMARY = "Metis examples"
DESCRIPTION = "METIS library provides to partitioning unstructured graphs and hypergraph \
and computing fill-reducing orderings of sparse matrices. This package provides \
graph files you can use to test Metis."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "metis-examples-5.1.0-9.11.noarch.rpm"
RPM_HASH = "bd6653563d004b91a23c7590873728f3e59cf323f2c5fe7d232fb3ce9147d153fcf21f5a5082c8efef03023f035693b2c5533c0323d692663abd3ee6e4f0ade9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metis-examples"

RDEPENDS:${PN} += ""

inherit rpm
