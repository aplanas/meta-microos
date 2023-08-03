SUMMARY = "Documentation for texlive-accfonts"
DESCRIPTION = "This package includes the documentation for texlive-accfonts"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.25svn18835"

RPM_NAME = "texlive-accfonts-doc-2023.209.0.0.25svn18835-55.1.noarch.rpm"
RPM_HASH = "ea5fa731d19c3462d58ab9c1f50c019e623abb4e148abfbcdec827acda135fe0adb7ebf7635c6fa0007f15425e739009f19fb6fc71e078f2dea21a66758bad8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-accfonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
