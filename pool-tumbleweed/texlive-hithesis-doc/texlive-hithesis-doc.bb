SUMMARY = "Documentation for texlive-hithesis"
DESCRIPTION = "This package includes the documentation for texlive-hithesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.11svn64005"

RPM_NAME = "texlive-hithesis-doc-2023.201.2.0.11svn64005-53.1.noarch.rpm"
RPM_HASH = "b94a9fe891985c6b4ff67e499e2c6a3375399356a2f38c0a5774313755414b2d57cc6264c924f7f6cde5a123d48a8ec87221bbe66e37680601fc6dc405cfa27f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hithesis-doc-zh \
texlive-hithesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
