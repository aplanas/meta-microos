SUMMARY = "Documentation for texlive-concepts"
DESCRIPTION = "This package includes the documentation for texlive-concepts"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.5_r1svn29020"

RPM_NAME = "texlive-concepts-doc-2023.201.0.0.0.5_r1svn29020-53.1.noarch.rpm"
RPM_HASH = "d370d658cb421572f34b31ce2c5fe348497497a4267953446e610d1d0d6e559d8c9f7d8d1c8895005bbccbebc6db30db730ed9edc0fbffa04323a30b20618ff4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-concepts-doc"

RDEPENDS:${PN} += ""

inherit rpm
