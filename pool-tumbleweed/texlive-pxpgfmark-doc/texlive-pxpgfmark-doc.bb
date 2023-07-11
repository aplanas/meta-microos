SUMMARY = "Documentation for texlive-pxpgfmark"
DESCRIPTION = "This package includes the documentation for texlive-pxpgfmark"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn30212"

RPM_NAME = "texlive-pxpgfmark-doc-2023.201.0.0.2svn30212-53.2.noarch.rpm"
RPM_HASH = "cf677496e37d0109303db63eea94618a7430a92d5e26931107abae9feda6a3cbae6f6a74e1f0610ea43593c853638242a295042ea536d0b0e1760919c88c737b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pxpgfmark-doc"

RDEPENDS:${PN} += ""

inherit rpm
