SUMMARY = "Documentation for texlive-filecontents"
DESCRIPTION = "This package includes the documentation for texlive-filecontents"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn52142"

RPM_NAME = "texlive-filecontents-doc-2023.201.1.5svn52142-52.1.noarch.rpm"
RPM_HASH = "0d18fb3494abf74fda55aaaed1297c2d0d97b4190954aff2b867e671b24d098b1740d6fb8e5709bf641a4b1c86248a38bde3fbe2a5315bb6a597d41110d43474"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-filecontents-doc"

RDEPENDS:${PN} += ""

inherit rpm
