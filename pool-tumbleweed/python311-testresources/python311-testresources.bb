SUMMARY = "A pyunit extension for managing expensive test resources"
DESCRIPTION = "testresources: extensions to python unittest to allow declarative use \
of resources by test cases."
LICENSE = "(Apache-2.0 | BSD-3-Clause) & GPL-2.0-or-later"

PV = "2.0.1"

RPM_NAME = "python311-testresources-2.0.1-7.1.noarch.rpm"
RPM_HASH = "b464fa6e5a02aadc6d2e15947dff05d65a1a4b05d88f5da01ba5bd4a34f9b8a099d884f0baca09c4983032107573a31ec7ee00362544cce6410ee177788d7e76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(testresources) \
python311-testresources \
python3dist(testresources)"
RDEPENDS:${PN} += "python(abi) \
python311-pbr"

inherit rpm
