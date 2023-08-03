SUMMARY = "Documentation for texlive-xetex-itrans"
DESCRIPTION = "This package includes the documentation for texlive-xetex-itrans"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.2svn55475"

RPM_NAME = "texlive-xetex-itrans-doc-2023.209.4.2svn55475-53.1.noarch.rpm"
RPM_HASH = "ce0f1c2e3e64989a2c2a8591948463039c2d14090e48a54d70e72a0326779fa285bd31e9b9656b2e39f4754132debc8a2dfddf9dd292acd4a90cb6374067524e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xetex-itrans-doc"

RDEPENDS:${PN} += ""

inherit rpm
