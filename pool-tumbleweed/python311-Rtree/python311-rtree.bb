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

RPM_NAME = "python311-Rtree-0.9.7-1.7.noarch.rpm"
RPM_HASH = "9f41d451068b22185dd021ff6bc1ded97e99cc3a09049b06d57906c1bb1129b0b5fadbbe09bf52e0e43458672a2c63da090ecf2a27c266e1e36094b7d1a31370"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(rtree) \
python311-Rtree \
python311-rtree \
python3dist(rtree)"

RDEPENDS:${PN} += "libspatialindex6 \
python(abi)"

inherit rpm
