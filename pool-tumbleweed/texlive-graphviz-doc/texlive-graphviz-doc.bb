SUMMARY = "Documentation for texlive-graphviz"
DESCRIPTION = "This package includes the documentation for texlive-graphviz"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.94svn31517"

RPM_NAME = "texlive-graphviz-doc-2023.201.0.0.94svn31517-53.1.noarch.rpm"
RPM_HASH = "b04040dee07577e674b6e306c9fb2d44832aef1ac42cf94ffec1392a9e2a0d4bdb5ec60b153f7acdbc3352f6198c8e57f0d12e102c0f1a39a5836e3ae72b39e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphviz-doc"

RDEPENDS:${PN} += ""

inherit rpm
