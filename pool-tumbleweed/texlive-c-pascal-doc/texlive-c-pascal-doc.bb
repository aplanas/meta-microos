SUMMARY = "Documentation for texlive-c-pascal"
DESCRIPTION = "This package includes the documentation for texlive-c-pascal"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.2svn18337"

RPM_NAME = "texlive-c-pascal-doc-2023.209.1.2svn18337-53.1.noarch.rpm"
RPM_HASH = "93adbefa2258e41c804c6e1fc39bcbadc7ef20b39a66d0b0c075c131bbb059683b25d1f4382098e6523c320b7538be69fd85b2f4578252fe6ce34497c8a33919"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-c-pascal-doc-en;pl \
texlive-c-pascal-doc"

RDEPENDS:${PN} += ""

inherit rpm
