SUMMARY = "Documentation for texlive-unfonts-core"
DESCRIPTION = "This package includes the documentation for texlive-unfonts-core"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn56291"

RPM_NAME = "texlive-unfonts-core-doc-2023.209.svn56291-54.1.noarch.rpm"
RPM_HASH = "c8cd495ffab18b29d9db376157c8519882ae6adad27cc2c472a0b628132e46d0dafb5072de3e7bef391228282b0bef0e0027da7aa65a14b79d2187e20f064b47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unfonts-core-doc"

RDEPENDS:${PN} += ""

inherit rpm
