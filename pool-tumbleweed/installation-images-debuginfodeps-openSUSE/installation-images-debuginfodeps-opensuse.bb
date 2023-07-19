SUMMARY = "Debuginfo dependencies for openSUSE installation-images"
DESCRIPTION = "Package that holds debuginfo dependencies for image files in installation-image."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "installation-images-debuginfodeps-openSUSE-17.89-1.47.aarch64.rpm"
RPM_HASH = "dd8e1efa832b80dc1d9b60b7ffd2e7fc8ba82aab0a023e7a51b97811a729740c7d023c5a2e2bb57ab758477531b173f1a71bad2282dce5752b7e6e82e8acba20"

RPROVIDES:${PN} += "debuginfo-build-id \
installation-images-debuginfodeps \
installation-images-debuginfodeps-openSUSE"

RDEPENDS:${PN} += "debuginfo-build-id"

inherit rpm
