SUMMARY = "Documentation for texlive-cite"
DESCRIPTION = "This package includes the documentation for texlive-cite"
LICENSE = "LPPL-1.0"

PV = "2023.209.5.5svn36428"

RPM_NAME = "texlive-cite-doc-2023.209.5.5svn36428-54.1.noarch.rpm"
RPM_HASH = "14c3077b37df6202003dfe59d2c67dd482c612b65a8c42be21e1d4b14beb4b9882ed916765ec0d9216ff866ab6a5b9fabee32e769b09342afcbb842061c1970c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cite-doc"

RDEPENDS:${PN} += ""

inherit rpm
