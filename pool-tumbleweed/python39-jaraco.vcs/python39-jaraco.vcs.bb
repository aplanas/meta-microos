SUMMARY = "Facilities for working with VCS repositories"
DESCRIPTION = "Facilities for working with VCS repositories"
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-jaraco.vcs-1.1.0-1.1.noarch.rpm"
RPM_HASH = "84989d75ca03f4634eadcf9c3c166466ce8c0878df28ddef578e89e9c306e8b51c0d0430635451f4d34dfe830ff416bed5b9195433029a11e1bfd556f8062f62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jaraco.vcs \
python39-jaraco.vcs \
python3dist-jaraco.vcs"

RDEPENDS:${PN} += "python-abi \
python39-jaraco.classes \
python39-jaraco.versioning \
python39-more-itertools \
python39-packaging"

inherit rpm
