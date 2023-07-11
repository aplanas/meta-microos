SUMMARY = "Development files for pybind11"
DESCRIPTION = "This package contains files for developing applications using pybind11."
LICENSE = "BSD-3-Clause"

PV = "2.10.4"

RPM_NAME = "python311-pybind11-devel-2.10.4-2.2.noarch.rpm"
RPM_HASH = "6721271c1c225f7417814b7c0e369908ef1e07498d3934f77149ff3ad50fdbf2edcaa8972419b0ae0c8a96497e268562c6edc966100857ed4750a0bac6c1f5a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pybind11-devel \
python311-pybind11-devel"

RDEPENDS:${PN} += "python-abi \
python311-devel \
python311-pybind11 \
python311-pybind11-common-devel"

inherit rpm
