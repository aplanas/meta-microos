SUMMARY = "Documentation for texlive-imac"
DESCRIPTION = "This package includes the documentation for texlive-imac"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn17347"

RPM_NAME = "texlive-imac-doc-2023.201.svn17347-52.1.noarch.rpm"
RPM_HASH = "1f2b7b74e4ac21b6d1b9e13c7baee434cfcaa2ab0ebd4011888d94c26e5d0ea5627913b24f709d995ac40a82fffc3e6fa6f748553257ff67eefff2e9dc1d7a29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-imac-doc"

RDEPENDS:${PN} += ""

inherit rpm
