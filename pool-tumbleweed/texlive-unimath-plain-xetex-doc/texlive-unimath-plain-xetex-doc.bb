SUMMARY = "Documentation for texlive-unimath-plain-xetex"
DESCRIPTION = "This package includes the documentation for texlive-unimath-plain-xetex"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2bsvn66394"

RPM_NAME = "texlive-unimath-plain-xetex-doc-2023.209.0.0.2bsvn66394-54.1.noarch.rpm"
RPM_HASH = "6277411a317035f7ccaba22f173cb54b50457413154f84108692c0893ef770f129b7519045cc1d4e7a45054d8a5b74569c975c48eb52d07fd10b81ab6125aa3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unimath-plain-xetex-doc"

RDEPENDS:${PN} += ""

inherit rpm
