SUMMARY = "A pyunit extension for managing expensive test resources"
DESCRIPTION = "testresources: extensions to python unittest to allow declarative use \
of resources by test cases."
LICENSE = "(Apache-2.0 | BSD-3-Clause) & GPL-2.0-or-later"

PV = "2.0.1"

RPM_NAME = "python39-testresources-2.0.1-7.3.noarch.rpm"
RPM_HASH = "45c21d4f988811fa9259a5f8a78d87759d334873f4ce042ca30539e23970399f9fdbce601d449564f32ecbb3cf7c2053bd6b7bb228bc709d50b37cc499d018dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-testresources \
python39-testresources \
python3dist-testresources"

RDEPENDS:${PN} += "python-abi \
python39-pbr"

inherit rpm
