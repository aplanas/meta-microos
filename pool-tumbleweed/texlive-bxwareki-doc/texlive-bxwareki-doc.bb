SUMMARY = "Documentation for texlive-bxwareki"
DESCRIPTION = "This package includes the documentation for texlive-bxwareki"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6svn51286"

RPM_NAME = "texlive-bxwareki-doc-2023.201.0.0.6svn51286-52.1.noarch.rpm"
RPM_HASH = "55115d847782b18acfb6d0d4aa6f57e12a9ffe8497a4518fcf780881a029fb12ea43252cf8855836167e22f79c906a9cbac1f9cd5d4746fa3876a24669f8edbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bxwareki-doc"

RDEPENDS:${PN} += ""

inherit rpm
