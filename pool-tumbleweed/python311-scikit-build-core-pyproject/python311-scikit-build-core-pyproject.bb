SUMMARY = "The scikit_build_core[pyproject] extra"
DESCRIPTION = "Python CMake adaptor and Python API for plugins: The extra requirement to build PEP518 wheels and sdists"
LICENSE = "Apache-2.0"

PV = "0.4.7"

RPM_NAME = "python311-scikit-build-core-pyproject-0.4.7-1.1.noarch.rpm"
RPM_HASH = "5e120dde797a8f49bf9ef87f699176daeaa2bda353ccf0933241e73ca4cc53a7043da580b73b401610672bc761307bd33574fc21f006633db4557acb283fc621"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-scikit-build-core-pyproject \
python311-scikit-build-core-pyproject"

RDEPENDS:${PN} += "python311-distlib \
python311-pathspec \
python311-pyproject-metadata \
python311-scikit-build-core"

inherit rpm
