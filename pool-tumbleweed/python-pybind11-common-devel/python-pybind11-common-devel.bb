SUMMARY = "Development files for pybind11"
DESCRIPTION = "This package contains files for developing applications using pybind11."
LICENSE = "BSD-3-Clause"

PV = "2.10.4"

RPM_NAME = "python-pybind11-common-devel-2.10.4-2.2.noarch.rpm"
RPM_HASH = "1ea10277bc4140a294843a4484d9fb04a811a36adf435505b8e22df15d010dc4155418697e5dc30487d4e25764ac69efd4036f8f02e6279eefdd4fdf85db1bcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake-pybind11 \
pkgconfig-pybind11 \
python-pybind11-common-devel \
python310-pybind11-common-devel \
python311-pybind11-common-devel \
python39-pybind11-common-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
