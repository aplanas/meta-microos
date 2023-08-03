SUMMARY = "Documentation for texlive-mintspirit"
DESCRIPTION = "This package includes the documentation for texlive-mintspirit"
LICENSE = "OFL-1.1"

PV = "2023.209.svn64461"

RPM_NAME = "texlive-mintspirit-doc-2023.209.svn64461-55.1.noarch.rpm"
RPM_HASH = "0c8652c3ba5ff8e4be4b607dfba38adb02ad9b96c10cea91579a5aa6c12d68e32a36017945e9a912393fc9be2198deb57de3e34a945bc922350d6370869cc9ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mintspirit-doc"

RDEPENDS:${PN} += ""

inherit rpm
