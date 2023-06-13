SUMMARY = "The scikit_build_core[pyproject] extra"
DESCRIPTION = "Python CMake adaptor and Python API for plugins: The extra requirement to build PEP518 wheels and sdists"
LICENSE = "Apache-2.0"

PV = "0.2.2"

RPM_NAME = "python39-scikit-build-core-pyproject-0.2.2-1.1.noarch.rpm"
RPM_HASH = "c57f26b6e322d07af07574054cf990bfa0f30aa18797824bb0010f50336fef7978966f71bf614863f535f62c6420e41452714df29787952931a493cfd1a06691"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-scikit-build-core-pyproject \
python39-scikit_build_core-pyproject"

RDEPENDS:${PN} += "python39-distlib \
python39-pathspec \
python39-pyproject-metadata \
python39-scikit-build-core"

inherit rpm
