SUMMARY = "Documentation for texlive-munich"
DESCRIPTION = "This package includes the documentation for texlive-munich"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-munich-doc-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "52abe5872acbaca14c9cdc0c95a4ee0f3ee4d1c92f3b79294bfc1d95f3b92672b3b9df16f71b0fcb2e9c008883af206afe5d898ccdd34e5f5e0d20a71341508b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-munich-doc"

RDEPENDS:${PN} += ""

inherit rpm
