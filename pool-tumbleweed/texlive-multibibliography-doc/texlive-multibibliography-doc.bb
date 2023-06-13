SUMMARY = "Documentation for texlive-multibibliography"
DESCRIPTION = "This package includes the documentation for texlive-multibibliography"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.03svn30939"

RPM_NAME = "texlive-multibibliography-doc-2023.201.1.03svn30939-54.1.noarch.rpm"
RPM_HASH = "5043698e531d15ab2497cbbb468fe93e7256d78db775b44b6b34ce5573250070d58fbb6b3be0e5abac353593da6ce0271b575342e02290134bd02447151d8393"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multibibliography-doc"

RDEPENDS:${PN} += ""

inherit rpm
