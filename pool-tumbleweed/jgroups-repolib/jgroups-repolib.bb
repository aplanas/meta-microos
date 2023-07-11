SUMMARY = "Artifacts to be uploaded to a repository library"
DESCRIPTION = "Artifacts to be uploaded to a repository library. \
This package is not meant to be installed but so its contents \
can be extracted through rpm2cpio"
LICENSE = "LGPL-2.0-or-later"

PV = "2.6.10"

RPM_NAME = "jgroups-repolib-2.6.10-33.10.noarch.rpm"
RPM_HASH = "a3dd1291a35262cc7975700986a6d8b9a89b4cddcafc29b7b528799e9769de48eb0d95634d39576693ba68972593139b5686e22a48b56b9ac26dde8e37e2af63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jgroups-repolib"

RDEPENDS:${PN} += ""

inherit rpm
