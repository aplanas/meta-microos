SUMMARY = "Documentation for texlive-nonumonpart"
DESCRIPTION = "This package includes the documentation for texlive-nonumonpart"
LICENSE = "LPPL-1.0"

PV = "2023.209.1svn22114"

RPM_NAME = "texlive-nonumonpart-doc-2023.209.1svn22114-55.1.noarch.rpm"
RPM_HASH = "a5338f19ec73ca41d3070b07e3e546fbe26ea86b2c4032c38e43c0d945ac44b2897fa68afa892000c481118d74ba93ba1ea900f4b8681cfe655137f2738d8c1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-nonumonpart-doc-fr;en \
texlive-nonumonpart-doc"

RDEPENDS:${PN} += ""

inherit rpm
