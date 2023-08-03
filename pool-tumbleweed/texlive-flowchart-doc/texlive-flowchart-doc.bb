SUMMARY = "Documentation for texlive-flowchart"
DESCRIPTION = "This package includes the documentation for texlive-flowchart"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.3svn36572"

RPM_NAME = "texlive-flowchart-doc-2023.209.3.3svn36572-53.1.noarch.rpm"
RPM_HASH = "cc6b85f4f964917c9e605a591cf3dd134620d886f7327c2c56c7e76852dfa6be4db4fdb5797c75d05012b4353d8cd088817728bb2ae1c2f4cb47b35a686f67d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-flowchart-doc"

RDEPENDS:${PN} += ""

inherit rpm
