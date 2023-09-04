SUMMARY = "Documentation for texlive-rgltxdoc"
DESCRIPTION = "This package includes the documentation for texlive-rgltxdoc"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn53858"

RPM_NAME = "texlive-rgltxdoc-doc-2023.209.1.3svn53858-54.2.noarch.rpm"
RPM_HASH = "2b547adc3ac33f9e303ab41431d46fefddb504369a7dfd7f512b41e52747a2055e9df778bb5f6d86bc4907dfce540155054b82375a1139f3ede1a94ca9293ef5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rgltxdoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
