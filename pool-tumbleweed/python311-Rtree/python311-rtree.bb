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

RPM_NAME = "python311-Rtree-0.9.7-1.9.noarch.rpm"
RPM_HASH = "0501523991779e87c240b969f95d507f49f5353dda15d52873f920a0d666b104cb17fa8e1a9fcc8fde5791ec9a6fee9b3784b1852b931738e5e1fa2cc5eacbea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Rtree \
python3-rtree \
python3.11dist-rtree \
python311-Rtree \
python311-rtree \
python3dist-rtree"

RDEPENDS:${PN} += "libspatialindex6 \
python-abi"

inherit rpm
