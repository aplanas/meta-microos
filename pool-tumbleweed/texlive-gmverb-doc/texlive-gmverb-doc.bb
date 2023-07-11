SUMMARY = "Documentation for texlive-gmverb"
DESCRIPTION = "This package includes the documentation for texlive-gmverb"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.98svn24288"

RPM_NAME = "texlive-gmverb-doc-2023.201.0.0.98svn24288-53.2.noarch.rpm"
RPM_HASH = "60f924ed9df9f8e63d19b878d6cb6f1fb4d896cd9bd98a6caa98ee7f775a8c65832b455f0158ced4b6337427a333ed3da0e17579d15922131e83d487b6b45f87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gmverb-doc"

RDEPENDS:${PN} += ""

inherit rpm
