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

PV = "0.2.2"

RPM_NAME = "python311-scikit-build-core-0.2.2-1.1.noarch.rpm"
RPM_HASH = "d963c7e105590b160e30fb4ad791664802441cf3f54e947cdcb1fdc7006a33502089af46a006d04d3b99e9d8843c92bdc8c4c979dcbd55192498a11f3a6af5d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(scikit-build-core) \
python311-scikit-build-core \
python311-scikit_build_core \
python3dist(scikit-build-core)"

RDEPENDS:${PN} += "(python311-exceptiongroup if python311-base < 3.11) \
(python311-importlib-resources >= 1.3 if python311-base < 3.9) \
(python311-tomli >= 1.1 if python311-base < 3.11) \
(python311-typing-extensions >= 3.10.0 if python311-base < 3.8) \
cmake \
python(abi) \
python311-packaging"

inherit rpm
