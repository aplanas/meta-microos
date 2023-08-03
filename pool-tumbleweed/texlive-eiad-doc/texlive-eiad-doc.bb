SUMMARY = "Documentation for texlive-eiad"
DESCRIPTION = "This package includes the documentation for texlive-eiad"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-eiad-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "41e7f685ab801b1c8a0c67e699d1db85277ee5d31b8731c17ce194d44446b77fa5f9af934c76dae7656d5fda2964e91a30113823c7a7065c18b413fd298cef1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eiad-doc"

RDEPENDS:${PN} += ""

inherit rpm
