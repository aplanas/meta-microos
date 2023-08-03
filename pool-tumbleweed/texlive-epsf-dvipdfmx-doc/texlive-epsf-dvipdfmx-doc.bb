SUMMARY = "Documentation for texlive-epsf-dvipdfmx"
DESCRIPTION = "This package includes the documentation for texlive-epsf-dvipdfmx"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.2014svn35575"

RPM_NAME = "texlive-epsf-dvipdfmx-doc-2023.209.2014svn35575-54.1.noarch.rpm"
RPM_HASH = "94c204496109f588aa18eb642000bc78e96d9bd6c764117585a9468e4700826b92155992e43ec80639eec6850322b5126308e79ba336872f2a1e44eaa162f21c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epsf-dvipdfmx-doc"

RDEPENDS:${PN} += ""

inherit rpm
