SUMMARY = "Documentation for texlive-apptools"
DESCRIPTION = "This package includes the documentation for texlive-apptools"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn28400"

RPM_NAME = "texlive-apptools-doc-2023.209.1.0svn28400-55.1.noarch.rpm"
RPM_HASH = "333e6087ea87bc5848c329100983ae760986e384cb49867217cfb29c2672b42b6318fcb236dd16ee15c7fceef5b1cb25a9f3ebd8f11884e40197193d0f9ed6d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apptools-doc"

RDEPENDS:${PN} += ""

inherit rpm
