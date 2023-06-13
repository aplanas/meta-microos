SUMMARY = "Documentation for texlive-progress"
DESCRIPTION = "This package includes the documentation for texlive-progress"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.10svn19519"

RPM_NAME = "texlive-progress-doc-2023.201.1.10svn19519-52.1.noarch.rpm"
RPM_HASH = "35b0f75f116376122e3418ea851b33747d270be119a5fb33dce7b74fca7ca3797558a593cc4c55519afdb8da47e715cff37960d9c7a70acf66b0b8a10ce18d90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-progress-doc"

RDEPENDS:${PN} += ""

inherit rpm
