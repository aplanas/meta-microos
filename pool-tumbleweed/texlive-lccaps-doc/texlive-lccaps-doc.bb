SUMMARY = "Documentation for texlive-lccaps"
DESCRIPTION = "This package includes the documentation for texlive-lccaps"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn46432"

RPM_NAME = "texlive-lccaps-doc-2023.201.1.0svn46432-54.1.noarch.rpm"
RPM_HASH = "3e00b03accbad7a13842f5174b04f9de99854da09a9839759798b6d2249117c99f0040afa82a57f6e3119cf9b7895a7b87505500dc6f4ebb2e5b277887cb2ad2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lccaps-doc"
RDEPENDS:${PN} += ""

inherit rpm
