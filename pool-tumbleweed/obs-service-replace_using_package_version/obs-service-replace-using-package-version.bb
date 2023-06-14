SUMMARY = "An OBS service: Replaces a regex  with the version value of a package"
DESCRIPTION = "This service replaces a given regex with the version value of \
a given package. Can be used to align the version of you package or image \
to the version of another package."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.7"

RPM_NAME = "obs-service-replace_using_package_version-0.0.7-2.1.noarch.rpm"
RPM_HASH = "0704f71def86b8ef74eab28b89eb55381ba9d34b568f1bfeb71ad641575a260bf82d84c7dfe216eb39ddd43b1f15588124eef1505b9c0d8ca1c339492a0aac57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-replace-using-package-version"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-docopt \
python3-rpm"

inherit rpm
