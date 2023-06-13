SUMMARY = "Documentation for texlive-tex-ewd"
DESCRIPTION = "This package includes the documentation for texlive-tex-ewd"
LICENSE = "BSD-3-Clause"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-tex-ewd-doc-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "2f953096aa52b2088c78839a7fa83de4c8dbf060138121715d01c868ede3f7e7a627de429a7692042cd48e6b47c6c4db8037802ebf7daddcd530646a27b13bfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex-ewd-doc"

RDEPENDS:${PN} += ""

inherit rpm
