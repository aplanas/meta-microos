SUMMARY = "Documentation for texlive-quran-bn"
DESCRIPTION = "This package includes the documentation for texlive-quran-bn"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn57602"

RPM_NAME = "texlive-quran-bn-doc-2023.209.0.0.1svn57602-54.2.noarch.rpm"
RPM_HASH = "7d4e6751c2a18fe103fa70db30c2d3c6f5a6c2fcac357962dc0d1b899cbfb0006816ea77de4c93199d7ee18b0a328ce4cbc0c9d58f7c1478881925783df66d45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quran-bn-doc"

RDEPENDS:${PN} += ""

inherit rpm
