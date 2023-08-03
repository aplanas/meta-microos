SUMMARY = "Documentation for texlive-udesoftec"
DESCRIPTION = "This package includes the documentation for texlive-udesoftec"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7.1svn57866"

RPM_NAME = "texlive-udesoftec-doc-2023.209.1.7.1svn57866-54.1.noarch.rpm"
RPM_HASH = "4aca113fe15ae8005480694ea34c32e7a66065c1d49f499d23d2f0da3ee8ac72e0bb84be3b28fb12632c3ce62b65990c98e840820c8fdf0eb1a224fc84b64895"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-udesoftec-doc-de \
texlive-udesoftec-doc"

RDEPENDS:${PN} += ""

inherit rpm
