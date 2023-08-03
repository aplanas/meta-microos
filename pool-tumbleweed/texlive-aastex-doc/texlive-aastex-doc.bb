SUMMARY = "Documentation for texlive-aastex"
DESCRIPTION = "This package includes the documentation for texlive-aastex"
LICENSE = "LPPL-1.0"

PV = "2023.209.6.3.1svn58057"

RPM_NAME = "texlive-aastex-doc-2023.209.6.3.1svn58057-55.1.noarch.rpm"
RPM_HASH = "6aac3c1ca5e4a93df762aec80057828fd36c1aa8791d94d358b22af4e075d30c835ccd72d52594499089a6b977dad0ed37d4ce9b4b4b7c75a3665dfcf1370500"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aastex-doc"

RDEPENDS:${PN} += ""

inherit rpm
