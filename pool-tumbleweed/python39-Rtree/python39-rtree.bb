SUMMARY = "R-Tree spatial index for Python GIS"
DESCRIPTION = "A ctypes Python wrapper of libspatialindex that provides a number of advanced \
spatial indexing features for the spatially curious Python user. \
 \
* Nearest neighbor search \
* Intersection search \
* Multi-dimensional indexes \
* Clustered indexes (store Python pickles directly with index entries) \
* Bulk loading \
* Deletion \
* Disk serialization \
* Custom storage implementation (to implement spatial indexing in ZODB, \
  for example)"
LICENSE = "MIT"

PV = "0.9.7"

RPM_NAME = "python39-Rtree-0.9.7-1.9.noarch.rpm"
RPM_HASH = "52ec550b67a319598f3d54bbd7fb0ff2869b74033d2b237fd6d4a4edecd931f476b086ff6bf324e12b1d7875cd364185436e4104ece00213c67b90fd8ef2dbf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rtree \
python39-Rtree \
python39-rtree \
python3dist-rtree"

RDEPENDS:${PN} += "libspatialindex6 \
python-abi"

inherit rpm
