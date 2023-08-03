SUMMARY = "Documentation for texlive-moodle"
DESCRIPTION = "This package includes the documentation for texlive-moodle"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn65672"

RPM_NAME = "texlive-moodle-doc-2023.209.1.0svn65672-55.1.noarch.rpm"
RPM_HASH = "40993db61abe327338750da63a55f752ce255b2f3c6ad1199ee2f2c893926111fece398d66da4a50dac843ced2eaa3928bbbdd8e8eedbbc1ac970c56ef480366"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-moodle-doc"

RDEPENDS:${PN} += ""

inherit rpm
