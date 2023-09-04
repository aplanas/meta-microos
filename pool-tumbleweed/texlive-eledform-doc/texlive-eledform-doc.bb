SUMMARY = "Documentation for texlive-eledform"
DESCRIPTION = "This package includes the documentation for texlive-eledform"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn38114"

RPM_NAME = "texlive-eledform-doc-2023.209.1.1asvn38114-54.2.noarch.rpm"
RPM_HASH = "2f4778e12b6e13e0836d077bdf6e7b377f5eb7065d7d70984891b4f4659d5f1ba5dd3bcce29a6082e60b90fa39741eabbc638f5351d4a4768189508c554cd635"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eledform-doc"

RDEPENDS:${PN} += ""

inherit rpm
