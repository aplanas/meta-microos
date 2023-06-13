SUMMARY = "Documentation for texlive-tex-ini-files"
DESCRIPTION = "This package includes the documentation for texlive-tex-ini-files"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn40533"

RPM_NAME = "texlive-tex-ini-files-doc-2023.201.svn40533-54.1.noarch.rpm"
RPM_HASH = "190122ca965df54ccb43ffc62b8dff536402283dfa9f9855d801254464a0c01e7d6da830c87e3e704a3c38f4b28521bb28db6146caff3b0d71ae0ae508c5b1ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex-ini-files-doc"

RDEPENDS:${PN} += ""

inherit rpm
