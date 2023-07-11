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

RPM_NAME = "python39-scikit-build-core-0.4.7-1.1.noarch.rpm"
RPM_HASH = "863063f5e804e59a91e41d04bb709281e116ba62a40e85fd74a7b22c6a89b0a32072571d044f63145fabb8837bf404c286ee72c2ecd5a96521a28b0ecbab8014"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-scikit-build-core \
python39-scikit-build-core \
python3dist-scikit-build-core"

RDEPENDS:${PN} += "cmake \
python-abi \
python39-packaging"

inherit rpm
