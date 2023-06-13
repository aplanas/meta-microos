SUMMARY = "The scikit_build_core[pyproject] extra"
DESCRIPTION = "Python CMake adaptor and Python API for plugins: The extra requirement to build PEP518 wheels and sdists"
LICENSE = "Apache-2.0"

PV = "0.2.2"

RPM_NAME = "python311-scikit-build-core-pyproject-0.2.2-1.1.noarch.rpm"
RPM_HASH = "90f7cfeba0489896a5e9a415b8b01046d03fa171fec58b84999b3294616520891ba5cd03baed0080041cd78a4d05c382185229f8594f303633f148e9672be67b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-scikit-build-core-pyproject \
python311-scikit_build_core-pyproject"

RDEPENDS:${PN} += "python311-distlib \
python311-pathspec \
python311-pyproject-metadata \
python311-scikit-build-core"

inherit rpm
