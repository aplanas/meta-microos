SUMMARY = "Python module to read rpm files"
DESCRIPTION = "Tools for inspecting RPM files in python. This module is modeled after the tarfile module."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "python39-rpmfile-1.0.4-1.14.noarch.rpm"
RPM_HASH = "86d3226887ff8e3f73cb5ce0dcc4343fe1b111b5aae98c043d9014696f6eb20a35c197b15c2809a90aabf6578e47d3184379b7af2fb77fe72f77df23b47f18c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rpmfile \
python39-rpmfile \
python3dist-rpmfile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
