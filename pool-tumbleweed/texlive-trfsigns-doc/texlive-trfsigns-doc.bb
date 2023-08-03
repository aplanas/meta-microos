SUMMARY = "Documentation for texlive-trfsigns"
DESCRIPTION = "This package includes the documentation for texlive-trfsigns"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.01svn15878"

RPM_NAME = "texlive-trfsigns-doc-2023.209.1.01svn15878-53.1.noarch.rpm"
RPM_HASH = "b73a8b4c36a018ca958fc0302c5f9ea29743623b578881d6f6e4c07cb3aadf4c26e1b282514c29a74a33134a14e8f8b09962a7d4e4338f7b90d37faddf61e66f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-trfsigns-doc-de \
texlive-trfsigns-doc"

RDEPENDS:${PN} += ""

inherit rpm
