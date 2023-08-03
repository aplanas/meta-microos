SUMMARY = "Documentation for texlive-paresse"
DESCRIPTION = "This package includes the documentation for texlive-paresse"
LICENSE = "LPPL-1.0"

PV = "2023.209.5.0.2svn59228"

RPM_NAME = "texlive-paresse-doc-2023.209.5.0.2svn59228-52.1.noarch.rpm"
RPM_HASH = "66417e0a33ccf1b8efaed8bb7392044a57b40c4df4645143d9d555f691c41651bb6333664b2e64e1884b31e7a5938a2f667e8d439b3211377553d70e501aadf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-paresse-doc-fr \
texlive-paresse-doc"

RDEPENDS:${PN} += ""

inherit rpm
