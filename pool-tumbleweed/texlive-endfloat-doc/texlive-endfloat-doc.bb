SUMMARY = "Documentation for texlive-endfloat"
DESCRIPTION = "This package includes the documentation for texlive-endfloat"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.7svn57090"

RPM_NAME = "texlive-endfloat-doc-2023.209.2.7svn57090-54.2.noarch.rpm"
RPM_HASH = "10c4229aa164b1361ac3fbb02dd9ffdae4175bbc5d111cbc4bf1148f2b0dadc22a6b83622078cd888f8f8287779b5e589143f8543af14d5b0847491deb238d9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-endfloat-doc"

RDEPENDS:${PN} += ""

inherit rpm
