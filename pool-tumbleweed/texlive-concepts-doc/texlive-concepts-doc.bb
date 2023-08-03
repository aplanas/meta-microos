SUMMARY = "Documentation for texlive-concepts"
DESCRIPTION = "This package includes the documentation for texlive-concepts"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0.5_r1svn29020"

RPM_NAME = "texlive-concepts-doc-2023.209.0.0.0.5_r1svn29020-54.1.noarch.rpm"
RPM_HASH = "928a862c50cb37a737aedb1834674f3489e45306be0f4c635276a1a6a139ef98fb20eade60c56b7f50da20b0fe7b9d4c49fc4c4b960e08aed8d2a0e1c1bc18f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-concepts-doc"

RDEPENDS:${PN} += ""

inherit rpm
