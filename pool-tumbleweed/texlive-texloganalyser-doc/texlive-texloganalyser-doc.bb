SUMMARY = "Documentation for texlive-texloganalyser"
DESCRIPTION = "This package includes the documentation for texlive-texloganalyser"
LICENSE = "BSD-3-Clause"

PV = "2023.201.0.0.11svn54526"

RPM_NAME = "texlive-texloganalyser-doc-2023.201.0.0.11svn54526-54.1.noarch.rpm"
RPM_HASH = "ec3e3e67fb0c1861a44731aa049334f4e200683ea2a0b90495ad8c87819e0351acc27af774a6f4decf5a7989786dfd95b34f7f6019b6261da132ba7df0d451b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texloganalyser-doc"

RDEPENDS:${PN} += ""

inherit rpm
