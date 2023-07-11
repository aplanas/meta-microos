SUMMARY = "Build backend for CMake based projects"
DESCRIPTION = "Python CMake adaptor and Python API for plugins \
 \
Features over classic Scikit-build: \
  - Better warnings, errors, and logging \
  - No warning about unused variables \
  - Automatically adds Ninja and/or CMake only as required \
  - No dependency on setuptools, distutils, or wheel in build mode. \
  - Powerful config system, including config options support in build mode. \
  - Automatic inclusion of site-packages in CMAKE_PREFIX_PATH \
  - FindPython is backported if running on CMake < 3.24 (included via hatchling in a submodule, configurable) \
  - Limited API / Stable ABI and pythonless tags supported via config option \
  - No slow generator search, ninja/make or MSVC used by default, respects CMAKE_GENERATOR \
  - SDists are reproducible by default (UNIX, Python 3.9+)"
LICENSE = "Apache-2.0"

PV = "0.4.7"

RPM_NAME = "python311-scikit-build-core-0.4.7-1.1.noarch.rpm"
RPM_HASH = "005d048bdfa5c735cb623d5ff3c2cf2797b92a6a93caa13c2c7e0175d874320c2a52c16988b038549a01f4e5946e5e0bf7e4e0ff4a12f618a8076812ae95eacd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-scikit-build-core \
python3.11dist-scikit-build-core \
python311-scikit-build-core \
python3dist-scikit-build-core"

RDEPENDS:${PN} += "cmake \
python-abi \
python311-packaging"

inherit rpm
