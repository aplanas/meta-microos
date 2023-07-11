SUMMARY = "The scikit_build_core[pyproject] extra"
DESCRIPTION = "Python CMake adaptor and Python API for plugins: The extra requirement to build PEP518 wheels and sdists"
LICENSE = "Apache-2.0"

PV = "0.4.7"

RPM_NAME = "python39-scikit-build-core-pyproject-0.4.7-1.1.noarch.rpm"
RPM_HASH = "712afd511e3a10690b12749d24028444f854e9c126e0222a0de9fe67789ffcedc58145052c125531f808ef9b885352b2a76e913209488480e0d36cbe153935a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-scikit-build-core-pyproject"

RDEPENDS:${PN} += "python39-distlib \
python39-pathspec \
python39-pyproject-metadata \
python39-scikit-build-core"

inherit rpm
