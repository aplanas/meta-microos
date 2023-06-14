SUMMARY = "Development files for pybind11"
DESCRIPTION = "This package contains files for developing applications using pybind11."
LICENSE = "BSD-3-Clause"

PV = "2.10.4"

RPM_NAME = "python-pybind11-common-devel-2.10.4-2.1.noarch.rpm"
RPM_HASH = "bb5ea9c82f96e9007a3f0e7d8cbd20c53de15dd28ab915fdf921a5f082927687b4472d75761e4f4373c9fe6465c5e6b783ec9d955e6c636770473f1f920a8db5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake-pybind11 \
pkgconfig-pybind11 \
python-pybind11-common-devel \
python310-pybind11-common-devel \
python311-pybind11-common-devel \
python39-pybind11-common-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
