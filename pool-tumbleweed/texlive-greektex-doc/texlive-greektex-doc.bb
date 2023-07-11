SUMMARY = "Documentation for texlive-greektex"
DESCRIPTION = "This package includes the documentation for texlive-greektex"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn28327"

RPM_NAME = "texlive-greektex-doc-2023.201.svn28327-53.2.noarch.rpm"
RPM_HASH = "3ae01354229c039dde4c745fd58f25a8aed4b05342b0b0d83cf33a6b76aa0169f0693d5d78f9a59243f2496da764713fdc957999b7346cca61aab8a369e8aa1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-greektex-doc-el \
texlive-greektex-doc"

RDEPENDS:${PN} += ""

inherit rpm
