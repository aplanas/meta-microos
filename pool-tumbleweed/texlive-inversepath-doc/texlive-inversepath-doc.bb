SUMMARY = "Documentation for texlive-inversepath"
DESCRIPTION = "This package includes the documentation for texlive-inversepath"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.2svn15878"

RPM_NAME = "texlive-inversepath-doc-2023.208.0.0.2svn15878-53.1.noarch.rpm"
RPM_HASH = "063f828cef5ce71110ab534b230e13bfb6c4bd8cc0a467980247e9bc769da8b44494d80ec780232ec0acf2c2e6ee118066ff25fd1b2a53d6fe52a0c556f233c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inversepath-doc"

RDEPENDS:${PN} += ""

inherit rpm
