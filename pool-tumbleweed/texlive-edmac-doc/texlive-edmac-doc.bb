SUMMARY = "Documentation for texlive-edmac"
DESCRIPTION = "This package includes the documentation for texlive-edmac"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.17svn61719"

RPM_NAME = "texlive-edmac-doc-2023.209.3.17svn61719-54.1.noarch.rpm"
RPM_HASH = "ea18affffc6464254106191f8f14bb838c83815332cd8990878640515801849f7fb745926f2191c27cda6eeeebd9e20c46e246f09a010591c587c470e46667bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-edmac-doc"

RDEPENDS:${PN} += ""

inherit rpm
