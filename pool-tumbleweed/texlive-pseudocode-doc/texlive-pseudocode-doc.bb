SUMMARY = "Documentation for texlive-pseudocode"
DESCRIPTION = "This package includes the documentation for texlive-pseudocode"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54080"

RPM_NAME = "texlive-pseudocode-doc-2023.201.svn54080-52.1.noarch.rpm"
RPM_HASH = "be75b4e79c753a5de8b31b35c6ef96d4173889c7ccabef1e0b3c359b68aaab942be08bfd93bbc53d8236790c49eff6ac90fb4d32e29445d5e9a18f18de40a03e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pseudocode-doc"

RDEPENDS:${PN} += ""

inherit rpm
