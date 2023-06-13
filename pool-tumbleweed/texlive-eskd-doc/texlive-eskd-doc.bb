SUMMARY = "Documentation for texlive-eskd"
DESCRIPTION = "This package includes the documentation for texlive-eskd"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-eskd-doc-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "55a0c4d8cafe8c081edeca6f333a79eb132a4bf2651678f38ce9215b1f963a538a508242e3ef1d5a9bf8501f75eb275f3a3eae469f9a9cb55c0f02c099f23c35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eskd-doc"

RDEPENDS:${PN} += ""

inherit rpm
