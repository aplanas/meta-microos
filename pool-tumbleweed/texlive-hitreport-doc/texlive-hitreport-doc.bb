SUMMARY = "Documentation for texlive-hitreport"
DESCRIPTION = "This package includes the documentation for texlive-hitreport"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0svn58357"

RPM_NAME = "texlive-hitreport-doc-2023.209.1.0.0svn58357-54.1.noarch.rpm"
RPM_HASH = "b24a1341d22962b2bf3d3c64b0455c071b46dbe3b25e8e98e65fcad732186907175269ef26a63ff404e0deb951d1ce246a27e2e39eab8de3e6ed91d2c58fff61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hitreport-doc-zh \
texlive-hitreport-doc"

RDEPENDS:${PN} += ""

inherit rpm
