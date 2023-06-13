SUMMARY = "Documentation for texlive-latino-sine-flexione"
DESCRIPTION = "This package includes the documentation for texlive-latino-sine-flexione"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.2svn53485"

RPM_NAME = "texlive-latino-sine-flexione-doc-2023.201.1.2svn53485-54.1.noarch.rpm"
RPM_HASH = "dbc19f174de9e1b3060c9db9148f2b21f29ba4003ff8007f551e8fbe46b11122c73395cb0a2d2b5d03078db121c493ab4ab6537aced2f15660b4381c1a9ec50f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latino-sine-flexione-doc"

RDEPENDS:${PN} += ""

inherit rpm
