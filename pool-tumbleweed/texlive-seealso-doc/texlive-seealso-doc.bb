SUMMARY = "Documentation for texlive-seealso"
DESCRIPTION = "This package includes the documentation for texlive-seealso"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn43595"

RPM_NAME = "texlive-seealso-doc-2023.209.1.2svn43595-54.1.noarch.rpm"
RPM_HASH = "47e8c7d36ee91f4b110818bff3914805af40ccb19bf006a76c91e20894cb1abff788b199c933a35969ec08431b49263e27d1f90f4d37fc2e17dfbb23f6b50756"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-seealso-doc"

RDEPENDS:${PN} += ""

inherit rpm
