SUMMARY = "Python module to read rpm files"
DESCRIPTION = "Tools for inspecting RPM files in python. This module is modeled after the tarfile module."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "python311-rpmfile-1.0.4-1.12.noarch.rpm"
RPM_HASH = "230b71bcd873837c5b6fdf7772e474e49fcd6984413d425e0c7041859799eab91b1823710737a60c7f7d828cb7399fcb5474c716acd30a8aa3d3cf57692a2e8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-rpmfile \
python311-rpmfile \
python3dist-rpmfile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
