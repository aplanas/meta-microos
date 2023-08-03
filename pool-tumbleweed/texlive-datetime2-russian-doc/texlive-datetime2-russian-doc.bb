SUMMARY = "Documentation for texlive-datetime2-russian"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-russian"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn49345"

RPM_NAME = "texlive-datetime2-russian-doc-2023.209.1.1svn49345-53.1.noarch.rpm"
RPM_HASH = "712bb00bfcee5906954b9668b4ce33edfc19d0f1e526a8e4348e7b9f5ff9ed18a2bef2a40dbc77a26ba98cc23378ed8065dcdd6cef26b936958fdc8cc19d34fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-russian-doc"

RDEPENDS:${PN} += ""

inherit rpm
