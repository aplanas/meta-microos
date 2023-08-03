SUMMARY = "Documentation for texlive-logix"
DESCRIPTION = "This package includes the documentation for texlive-logix"
LICENSE = "OFL-1.1"

PV = "2023.209.1.13svn63688"

RPM_NAME = "texlive-logix-doc-2023.209.1.13svn63688-55.1.noarch.rpm"
RPM_HASH = "1a8524e3cd4fb728db8a2b8422c90d18e8e6b78e9f7490a9aa91dd2539c431b671fb85f087256041b7896692086a8d147e3c16abf8b80ac708820828c95ab5cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-logix-doc"

RDEPENDS:${PN} += ""

inherit rpm
