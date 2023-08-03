SUMMARY = "Documentation for texlive-stix2-type1"
DESCRIPTION = "This package includes the documentation for texlive-stix2-type1"
LICENSE = "OFL-1.1"

PV = "2023.209.2.0.2svn57448"

RPM_NAME = "texlive-stix2-type1-doc-2023.209.2.0.2svn57448-58.1.noarch.rpm"
RPM_HASH = "50c7340d404ed526cdb347a8b9b6e4422ca5e518a009e0e60cea1bc13304d96b6d1483422fff5b8c358cc2ee8bca1ddafc722935aa778ed1dffe66a8b1cd2b53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stix2-type1-doc"

RDEPENDS:${PN} += ""

inherit rpm
