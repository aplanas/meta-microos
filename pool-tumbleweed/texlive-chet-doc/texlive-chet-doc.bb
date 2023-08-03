SUMMARY = "Documentation for texlive-chet"
DESCRIPTION = "This package includes the documentation for texlive-chet"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2svn45081"

RPM_NAME = "texlive-chet-doc-2023.209.2.2svn45081-54.1.noarch.rpm"
RPM_HASH = "bd38d62df61ef93f644085072b5c8580bd79f3c9e817f5fb960929ccafba9d520103b0fa178ea52f52c9e167771e68d32b9149a90bb5857de667bb0e49a91acc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chet-doc"

RDEPENDS:${PN} += ""

inherit rpm
