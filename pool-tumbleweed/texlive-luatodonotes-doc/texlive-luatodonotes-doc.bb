SUMMARY = "Documentation for texlive-luatodonotes"
DESCRIPTION = "This package includes the documentation for texlive-luatodonotes"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.5svn53825"

RPM_NAME = "texlive-luatodonotes-doc-2023.208.0.0.5svn53825-53.1.noarch.rpm"
RPM_HASH = "d117d5fb2247785d26e5382d5d057dcd7c2734d7770e5f1be3021ababf9706e37d6f49f631d7637bab190d8030eda813af93d0c89a14708263c4ac94b4ffe351"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luatodonotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
