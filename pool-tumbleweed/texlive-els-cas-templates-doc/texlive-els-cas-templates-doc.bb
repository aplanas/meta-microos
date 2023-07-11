SUMMARY = "Documentation for texlive-els-cas-templates"
DESCRIPTION = "This package includes the documentation for texlive-els-cas-templates"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3svn62931"

RPM_NAME = "texlive-els-cas-templates-doc-2023.201.2.3svn62931-53.2.noarch.rpm"
RPM_HASH = "207932a7224f98b2ee4d062a6be39ffe24c93c5f10e00af67f6dd7188c04253dd450382d5f5445d520eaabfd2a3f883da4a36af593a385310ba266abad22a96e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-els-cas-templates-doc"

RDEPENDS:${PN} += ""

inherit rpm
