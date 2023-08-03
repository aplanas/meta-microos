SUMMARY = "Documentation for texlive-refstyle"
DESCRIPTION = "This package includes the documentation for texlive-refstyle"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn20318"

RPM_NAME = "texlive-refstyle-doc-2023.209.0.0.5svn20318-54.1.noarch.rpm"
RPM_HASH = "4e51965e9e1d8c45409cf89f306c4544b60eef68c8c97291baa2d2ba33ebe5440b61ad09c2d7d92573705210435ed708d857dd72835195e75cfd638fed433157"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-refstyle-doc"

RDEPENDS:${PN} += ""

inherit rpm
