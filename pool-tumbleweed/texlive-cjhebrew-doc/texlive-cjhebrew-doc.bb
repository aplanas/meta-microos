SUMMARY = "Documentation for texlive-cjhebrew"
DESCRIPTION = "This package includes the documentation for texlive-cjhebrew"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2asvn43444"

RPM_NAME = "texlive-cjhebrew-doc-2023.209.0.0.2asvn43444-54.1.noarch.rpm"
RPM_HASH = "fc921195dd38b0be0b5c5f4a8d9da80e2f96abc8b6a05521492c908af37012e224b58ea6cc34093bc5975c813686aeceb29ad413536656f8c7f8c6920137a20c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cjhebrew-doc"

RDEPENDS:${PN} += ""

inherit rpm
