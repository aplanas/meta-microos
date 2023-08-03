SUMMARY = "Documentation for texlive-recipebook"
DESCRIPTION = "This package includes the documentation for texlive-recipebook"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn37026"

RPM_NAME = "texlive-recipebook-doc-2023.209.svn37026-54.1.noarch.rpm"
RPM_HASH = "4b3accf2f761a4867a1e1ea0de61e7fbf98f5e320ec241f7f248c2111e18c7024fa007f58006ec12bbd81c2366cac6eeb6cc40a405acbd30da33723c8ca01a85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-recipebook-doc"

RDEPENDS:${PN} += ""

inherit rpm
