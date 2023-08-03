SUMMARY = "Documentation for texlive-codedoc"
DESCRIPTION = "This package includes the documentation for texlive-codedoc"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn17630"

RPM_NAME = "texlive-codedoc-doc-2023.209.0.0.3svn17630-54.1.noarch.rpm"
RPM_HASH = "9a555d4cedcf7ce0e6968295664dec5ddd3bcc8b5941c0ff5ef03f81c2fdbaba291cd039e7e413fd94c3b7e0d19f01f246b6475788e3fd89ade1d22b8e6b8141"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-codedoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
