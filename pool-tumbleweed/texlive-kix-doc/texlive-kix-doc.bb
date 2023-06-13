SUMMARY = "Documentation for texlive-kix"
DESCRIPTION = "This package includes the documentation for texlive-kix"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn21606"

RPM_NAME = "texlive-kix-doc-2023.201.svn21606-55.1.noarch.rpm"
RPM_HASH = "af617564b953ae67289c8158f93dc2281396c320514127b031d2c7cf494423fc623569a3c8dd7123f864e1f332b93af05e9cf72dbca8bf42bd65d3e4f8182853"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kix-doc"

RDEPENDS:${PN} += ""

inherit rpm
