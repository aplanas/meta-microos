SUMMARY = "Development files for pybind11"
DESCRIPTION = "This package contains files for developing applications using pybind11."
LICENSE = "BSD-3-Clause"

PV = "2.10.4"

RPM_NAME = "python39-pybind11-devel-2.10.4-2.2.noarch.rpm"
RPM_HASH = "f81c698c1c82338983380561ec0c8c2f9cf51f462560811d670cea5847b8113d44992ccff7c55b441898d593177d70c3ee6ee0c8b72a985ed69d74fc10ab4f76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pybind11-devel"

RDEPENDS:${PN} += "python-abi \
python39-devel \
python39-pybind11 \
python39-pybind11-common-devel"

inherit rpm
