SUMMARY = "Documentation for texlive-nih"
DESCRIPTION = "This package includes the documentation for texlive-nih"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-nih-doc-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "b38e0c46f13386c9202fe02b790ae9fb4945686c6d99c8a56040aab168e3845200541ec2dee9fb1fffde743c2b5516769eedc5616c650eb6f5d1b7c846d8ebea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nih-doc"

RDEPENDS:${PN} += ""

inherit rpm
