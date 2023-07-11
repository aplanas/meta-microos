SUMMARY = "The scikit_build_core[pyproject] extra"
DESCRIPTION = "Python CMake adaptor and Python API for plugins: The extra requirement to build PEP518 wheels and sdists"
LICENSE = "Apache-2.0"

PV = "0.4.7"

RPM_NAME = "python310-scikit-build-core-pyproject-0.4.7-1.1.noarch.rpm"
RPM_HASH = "d062ec6876ce77f1b8daefbcacf1c407215c2dde359302497f21ce05b8fa4c93582eecc50cb550251e726ded4e141eff4dc3b188b1db23076afb4c99f0f4d7de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-scikit-build-core-pyproject"

RDEPENDS:${PN} += "python310-distlib \
python310-pathspec \
python310-pyproject-metadata \
python310-scikit-build-core"

inherit rpm
