SUMMARY = "Documentation for texlive-cmdstring"
DESCRIPTION = "This package includes the documentation for texlive-cmdstring"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-cmdstring-doc-2023.209.1.1svn15878-54.1.noarch.rpm"
RPM_HASH = "b28ccf430fc937481dba74cdaac0179d87d0c2222c0a188284416eed0a3c25e7c5e771d0bccff2b2e67b5e5925c443efee844a89d1f74f894c7ca761416cbe38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmdstring-doc"

RDEPENDS:${PN} += ""

inherit rpm
