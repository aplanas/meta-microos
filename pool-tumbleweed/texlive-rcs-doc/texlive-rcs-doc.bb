SUMMARY = "Documentation for texlive-rcs"
DESCRIPTION = "This package includes the documentation for texlive-rcs"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-rcs-doc-2023.201.svn15878-53.2.noarch.rpm"
RPM_HASH = "f14e6b519eeb1fda474e3317290bfde9f6934ffbe2067bb84135de549aaf25433095b3411ae4a3caacbb599de11521315d7c8dff7b884b8e7331813245df4890"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rcs-doc"

RDEPENDS:${PN} += ""

inherit rpm
