SUMMARY = "Documentation for texlive-topletter"
DESCRIPTION = "This package includes the documentation for texlive-topletter"
LICENSE = "Apache-1.0"

PV = "2023.201.0.0.3.0svn48182"

RPM_NAME = "texlive-topletter-doc-2023.201.0.0.3.0svn48182-52.1.noarch.rpm"
RPM_HASH = "3979bf822f8fcfd66b7528c93f69b94d844e37ab00390f87236c92d77468883f2498d382464e48b45eeaeaa1809ef0c8e741179e75c011c4078040c55fb0db28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-topletter-doc:it) \
texlive-topletter-doc"

RDEPENDS:${PN} += ""

inherit rpm
