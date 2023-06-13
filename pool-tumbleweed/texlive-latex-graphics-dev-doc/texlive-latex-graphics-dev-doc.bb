SUMMARY = "Documentation for texlive-latex-graphics-dev"
DESCRIPTION = "This package includes the documentation for texlive-latex-graphics-dev"
LICENSE = "LPPL-1.0"

PV = "2023.201.20230501_pre_release_0svn64899"

RPM_NAME = "texlive-latex-graphics-dev-doc-2023.201.20230501_pre_release_0svn64899-55.1.noarch.rpm"
RPM_HASH = "58ec29cb8104ec240cf267ef163184a9ae7ef3524fc2a373032646e9cda3e9e3cdde799d071457c91e0265c83ceb0857859bd4a711e5cb240cecb26c02303cb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-graphics-dev-doc"

RDEPENDS:${PN} += ""

inherit rpm
