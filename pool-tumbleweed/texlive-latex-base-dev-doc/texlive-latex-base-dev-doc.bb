SUMMARY = "Documentation for texlive-latex-base-dev"
DESCRIPTION = "This package includes the documentation for texlive-latex-base-dev"
LICENSE = "LPPL-1.0"

PV = "2023.201.20230601_pre_release_2svn66513"

RPM_NAME = "texlive-latex-base-dev-doc-2023.201.20230601_pre_release_2svn66513-55.1.noarch.rpm"
RPM_HASH = "f29baa63926895e957d9514405e2dcab02bbc8fc9195c43b8a53e0025826b27c17132bedafda739dc98c760a3b1664e0a650afc390c474b9135a519894d9370d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-base-dev-doc"

RDEPENDS:${PN} += ""

inherit rpm
