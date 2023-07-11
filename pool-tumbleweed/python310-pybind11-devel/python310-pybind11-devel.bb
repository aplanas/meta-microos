SUMMARY = "Development files for pybind11"
DESCRIPTION = "This package contains files for developing applications using pybind11."
LICENSE = "BSD-3-Clause"

PV = "2.10.4"

RPM_NAME = "python310-pybind11-devel-2.10.4-2.2.noarch.rpm"
RPM_HASH = "45c1cc3e46288e3f5d036b86d06186b0ad7ebf0b5597d4cd112f6e47ced5175c5516a179e92067372a6019ea9b7868f36eca12d0426547fbd29a3326af7755f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pybind11-devel"

RDEPENDS:${PN} += "python-abi \
python310-devel \
python310-pybind11 \
python310-pybind11-common-devel"

inherit rpm
