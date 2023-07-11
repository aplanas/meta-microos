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

RPM_NAME = "python310-Rtree-0.9.7-1.9.noarch.rpm"
RPM_HASH = "5c90b2af4fe41cff7f50d3dcc15607a0b008f36ad699165286ec0a852ab4fad4ba3200759def6164d84ddb1c282678d3e26c4e65374aa39b7eda151890be64df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-rtree \
python310-Rtree \
python310-rtree \
python3dist-rtree"

RDEPENDS:${PN} += "libspatialindex6 \
python-abi"

inherit rpm
