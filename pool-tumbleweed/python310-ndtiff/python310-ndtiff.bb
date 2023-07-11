SUMMARY = "Python libraries for NDTiff datasets"
DESCRIPTION = "Python libraries for NDTiff datasets"
LICENSE = "BSD-3-Clause"

PV = "1.12.0"

RPM_NAME = "python310-ndtiff-1.12.0-1.3.noarch.rpm"
RPM_HASH = "06051004cb251eade3e8f0063ec14bf622d80682c27e302b602034c91cdc79c1e6fdee7fc588dd00b3bd919f2484eb395a79b85dd8e913e92bf0e40470ffa2ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ndtiff \
python310-ndtiff \
python3dist-ndtiff"

RDEPENDS:${PN} += "python-abi \
python310-dask-array \
python310-numpy"

inherit rpm
