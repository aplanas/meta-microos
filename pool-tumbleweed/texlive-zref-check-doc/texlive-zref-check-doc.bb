SUMMARY = "Documentation for texlive-zref-check"
DESCRIPTION = "This package includes the documentation for texlive-zref-check"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.2svn63845"

RPM_NAME = "texlive-zref-check-doc-2023.201.0.0.3.2svn63845-52.1.noarch.rpm"
RPM_HASH = "bfb8ac43beac2acee294fbe1589c65e44bb594c892724204bd280e439106712b8958d98b7b527b2997d57da33081a0818250ebf3aa31a4a5ec048f652fd4482e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zref-check-doc"
RDEPENDS:${PN} += ""

inherit rpm
