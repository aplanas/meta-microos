SUMMARY = "Documentation for texlive-fonts-churchslavonic"
DESCRIPTION = "This package includes the documentation for texlive-fonts-churchslavonic"
LICENSE = "OFL-1.1"

PV = "2023.201.2.2svn56350"

RPM_NAME = "texlive-fonts-churchslavonic-doc-2023.201.2.2svn56350-52.1.noarch.rpm"
RPM_HASH = "30b2bbb55d9ed9dda0fa0f9666419837d7067bb029308e15cec6eeefc5e54df9f591a4167cb7d0a6a1057df31b1a0155190983765b0e555617fcec5e3153e7c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fonts-churchslavonic-doc"

RDEPENDS:${PN} += ""

inherit rpm
