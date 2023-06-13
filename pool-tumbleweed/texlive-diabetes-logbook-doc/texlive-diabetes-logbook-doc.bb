SUMMARY = "Documentation for texlive-diabetes-logbook"
DESCRIPTION = "This package includes the documentation for texlive-diabetes-logbook"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54810"

RPM_NAME = "texlive-diabetes-logbook-doc-2023.201.svn54810-52.1.noarch.rpm"
RPM_HASH = "293265fc6e299d4b98f15358f8e149ea658b1a61f07dc29b1fa7742f4d39671415f0b57592f34057addbcbc8b617fabed0cd4b618022678030764ffd731e5df6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-diabetes-logbook-doc"

RDEPENDS:${PN} += ""

inherit rpm
