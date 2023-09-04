SUMMARY = "Facilities for working with VCS repositories"
DESCRIPTION = "Facilities for working with VCS repositories"
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-jaraco.vcs-1.1.0-1.1.noarch.rpm"
RPM_HASH = "ee6c238d586b6c43af83b180e968e86581ae738d5413c7f3f4f5a1a30f5a465abe330a242d1973a9cff0c1f905da957767b2d65621bd705709c26358000ebf89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.vcs \
python3.11dist-jaraco.vcs \
python311-jaraco.vcs \
python3dist-jaraco.vcs"

RDEPENDS:${PN} += "python-abi \
python311-jaraco.classes \
python311-jaraco.versioning \
python311-more-itertools \
python311-packaging"

inherit rpm
