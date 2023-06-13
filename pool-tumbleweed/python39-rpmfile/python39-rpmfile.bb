SUMMARY = "Python module to read rpm files"
DESCRIPTION = "Tools for inspecting RPM files in python. This module is modeled after the tarfile module."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "python39-rpmfile-1.0.4-1.12.noarch.rpm"
RPM_HASH = "60c8594f2fe8deecdf337c2affc079ed3dc9b9f78110811a7b280a46e4319373b646a05ca72740c15ef0343e76cc29dbcb33c27ec9b468b56105924b304fae25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(rpmfile) \
python39-rpmfile \
python3dist(rpmfile)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
