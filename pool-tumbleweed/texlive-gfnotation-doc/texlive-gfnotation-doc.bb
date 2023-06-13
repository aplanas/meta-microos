SUMMARY = "Documentation for texlive-gfnotation"
DESCRIPTION = "This package includes the documentation for texlive-gfnotation"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.9svn37156"

RPM_NAME = "texlive-gfnotation-doc-2023.201.2.9svn37156-52.1.noarch.rpm"
RPM_HASH = "3b22a5fece4e772151219f12e8a121656f244b305b6065962359cb33e2a5ea7e785c1fbb77382020cb50ea2b5755e7c10d5a79dfdd2e508075beea89d58d75cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gfnotation-doc"

RDEPENDS:${PN} += ""

inherit rpm
