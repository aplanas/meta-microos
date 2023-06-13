SUMMARY = "Documentation for texlive-minitoc"
DESCRIPTION = "This package includes the documentation for texlive-minitoc"
LICENSE = "LPPL-1.0"

PV = "2023.201.62svn61719"

RPM_NAME = "texlive-minitoc-doc-2023.201.62svn61719-54.1.noarch.rpm"
RPM_HASH = "6366e17fb510b85dde206317726f428d22757f2df9b63ce52ca878c1b210a597d2430a5b9169696e174330295ed166a5c5a42bd608d0658d2c7cb43f0471d224"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-minitoc-doc:en) \
texlive-minitoc-doc"

RDEPENDS:${PN} += "/bin/csh \
/bin/sh"

inherit rpm
