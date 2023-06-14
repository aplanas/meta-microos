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

RPM_NAME = "python39-Rtree-0.9.7-1.7.noarch.rpm"
RPM_HASH = "03889117726fa6543f689f05a7f53147790a8776b37f8ac0cca87e462fa70aa84531cb6fbdae5062002c851ef30b04f1a40482e4af8f0fbf7990d7c5495d4ed9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rtree \
python39-Rtree \
python39-rtree \
python3dist-rtree"

RDEPENDS:${PN} += "libspatialindex6 \
python-abi"

inherit rpm
