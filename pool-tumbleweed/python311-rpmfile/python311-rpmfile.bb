SUMMARY = "Python module to read rpm files"
DESCRIPTION = "Tools for inspecting RPM files in python. This module is modeled after the tarfile module."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "python311-rpmfile-1.0.4-1.14.noarch.rpm"
RPM_HASH = "80d9076a5428028fbecb761b9c3f8e2473734b89410cd9dd58402ccaa4c8a0a32596172100fe47dd1a045f0e1eeeb67deaa858c6ef68fdc6b64833ee64aa711d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rpmfile \
python3.11dist-rpmfile \
python311-rpmfile \
python3dist-rpmfile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
