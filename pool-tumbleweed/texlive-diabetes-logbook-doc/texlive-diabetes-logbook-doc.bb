SUMMARY = "Documentation for texlive-diabetes-logbook"
DESCRIPTION = "This package includes the documentation for texlive-diabetes-logbook"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54810"

RPM_NAME = "texlive-diabetes-logbook-doc-2023.209.svn54810-53.1.noarch.rpm"
RPM_HASH = "adfa39fb7dc6eb964f7b1cc09d523d7f9ad7fdeea7d40ce9f46d3d28199bcac8f465d49499ee41601cbf30d79479fbfc8ee2be8b5a50397598da485cae4a8db3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-diabetes-logbook-doc"

RDEPENDS:${PN} += ""

inherit rpm
