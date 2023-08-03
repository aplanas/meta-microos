SUMMARY = "Documentation for texlive-mluexercise"
DESCRIPTION = "This package includes the documentation for texlive-mluexercise"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn56927"

RPM_NAME = "texlive-mluexercise-doc-2023.209.2.0svn56927-55.1.noarch.rpm"
RPM_HASH = "1c9126f11f10c2f890a31763331bb142aa186a639decdc4ab4c5c09d21fbec3e4bd99f7a9701181328809a9e666ad8dc21fe139fd2eedb1b8e537411559862dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mluexercise-doc"

RDEPENDS:${PN} += ""

inherit rpm
