SUMMARY = "Documentation for texlive-aeguill"
DESCRIPTION = "This package includes the documentation for texlive-aeguill"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-aeguill-doc-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "fe7bf0c0e1b532608e91274bd56e7ac4e894229226060c004cb0a2d895632eb4b8a227d1f55585fffaa990fc574d2d06336bb9bdbe5e6021f0948e83a84ee7b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aeguill-doc"

RDEPENDS:${PN} += ""

inherit rpm
