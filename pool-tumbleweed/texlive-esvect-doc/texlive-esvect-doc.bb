SUMMARY = "Documentation for texlive-esvect"
DESCRIPTION = "This package includes the documentation for texlive-esvect"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.3svn32098"

RPM_NAME = "texlive-esvect-doc-2023.201.1.3svn32098-52.1.noarch.rpm"
RPM_HASH = "5046d107ba3662cb3cd819960da9c58814c09f5977c924e55c097b235ba224644634167872d61a1999baee374368a97bfb4476eed5301d044a181f8abfb71e96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-esvect-doc"
RDEPENDS:${PN} += ""

inherit rpm
