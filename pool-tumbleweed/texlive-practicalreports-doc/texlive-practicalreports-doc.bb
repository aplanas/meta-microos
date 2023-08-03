SUMMARY = "Documentation for texlive-practicalreports"
DESCRIPTION = "This package includes the documentation for texlive-practicalreports"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0.3svn52312"

RPM_NAME = "texlive-practicalreports-doc-2023.209.2.0.3svn52312-53.1.noarch.rpm"
RPM_HASH = "ea129c0a065d61c3801a7563d7305a299aa95f6e05e4341d6a4407c72fb71b526329fa94718525be540e0316d22b8dacfa99aab94b4112b4cee6fb243d7601ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-practicalreports-doc"

RDEPENDS:${PN} += ""

inherit rpm
