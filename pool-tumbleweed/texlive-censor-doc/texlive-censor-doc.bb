SUMMARY = "Documentation for texlive-censor"
DESCRIPTION = "This package includes the documentation for texlive-censor"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.2svn63126"

RPM_NAME = "texlive-censor-doc-2023.201.4.2svn63126-52.1.noarch.rpm"
RPM_HASH = "fda422e90678cac6ff89793eca94ca5e3fa65c9c42ed3ec574b46325c54338b1f29ccb8b5c96d91adc324ba4e844cf0e9ba9c6999ec037e1104b6f18f62000e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-censor-doc"

RDEPENDS:${PN} += ""

inherit rpm
