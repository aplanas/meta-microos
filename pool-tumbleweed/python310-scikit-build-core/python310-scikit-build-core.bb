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

RPM_NAME = "python310-scikit-build-core-0.4.7-1.1.noarch.rpm"
RPM_HASH = "ca5ff8f183f6c225dc30af6c53ea5c2a1a378b53d41d1682de9e1ae6557c0c491f90a21347d4c1ca1b8c19c9f137a90583deee3aa7f7177c48a1c52a1f36a4b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-scikit-build-core \
python310-scikit-build-core \
python3dist-scikit-build-core"

RDEPENDS:${PN} += "cmake \
python-abi \
python310-packaging"

inherit rpm
