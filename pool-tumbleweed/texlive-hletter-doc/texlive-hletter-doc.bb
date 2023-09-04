SUMMARY = "Documentation for texlive-hletter"
DESCRIPTION = "This package includes the documentation for texlive-hletter"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.2svn30002"

RPM_NAME = "texlive-hletter-doc-2023.209.4.2svn30002-54.2.noarch.rpm"
RPM_HASH = "59dfe1ce3a50ad89ed5060e65600d9bbfc20c8cf58f622ef1f65f60816eba709ef2a6cf5f45ae307b65fc3312a5b6fadc91a71224152a04762e1ecb9625a6968"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hletter-doc"

RDEPENDS:${PN} += ""

inherit rpm
