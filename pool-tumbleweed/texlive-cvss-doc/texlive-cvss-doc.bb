SUMMARY = "Documentation for texlive-cvss"
DESCRIPTION = "This package includes the documentation for texlive-cvss"
LICENSE = "LPPL-1.0"

PV = "2023.204.1.1.0svn65169"

RPM_NAME = "texlive-cvss-doc-2023.204.1.1.0svn65169-54.1.noarch.rpm"
RPM_HASH = "b7ef159fca7127d1fc7cf33dbdb457d6459962d95501005b27dc30a11d84ba8409a191ef8836df151504da9f58865844405f749261b145073f0ec471e8c12436"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cvss-doc"
RDEPENDS:${PN} += ""

inherit rpm
