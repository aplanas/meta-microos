SUMMARY = "Documentation for texlive-accents"
DESCRIPTION = "This package includes the documentation for texlive-accents"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn51497"

RPM_NAME = "texlive-accents-doc-2023.201.1.4svn51497-54.1.noarch.rpm"
RPM_HASH = "9fc6a5c165d50e97d83633c7998b8f0e3be452acd93f79f49c0a0d443cb26664728347d62f7661f240f2714c944e8aa879eb8e5f8e3d325a7bcc08a2f13a1b95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-accents-doc"

RDEPENDS:${PN} += ""

inherit rpm
