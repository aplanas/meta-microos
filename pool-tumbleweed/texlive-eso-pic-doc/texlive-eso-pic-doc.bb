SUMMARY = "Documentation for texlive-eso-pic"
DESCRIPTION = "This package includes the documentation for texlive-eso-pic"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0asvn56658"

RPM_NAME = "texlive-eso-pic-doc-2023.209.3.0asvn56658-53.1.noarch.rpm"
RPM_HASH = "ed3cf92b0de62248738c4ff00fc0e74945749b479239d4198909de0c5abac561e60c8a4e88e448140dc63c2e460695f855bde985e14b376371ea2d4a10577227"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eso-pic-doc"

RDEPENDS:${PN} += ""

inherit rpm
