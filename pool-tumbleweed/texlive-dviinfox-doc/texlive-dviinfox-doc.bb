SUMMARY = "Documentation for texlive-dviinfox"
DESCRIPTION = "This package includes the documentation for texlive-dviinfox"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.06svn59216"

RPM_NAME = "texlive-dviinfox-doc-2023.209.1.06svn59216-54.1.noarch.rpm"
RPM_HASH = "af5ec0944e82ddc0c27c2b316c2e3bdfadc41bef27366244792f43987109ec286a413d08389825f706a0c1f448acfa571b50597578c4599f60610aa9578af904"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dviinfox-doc"

RDEPENDS:${PN} += ""

inherit rpm
