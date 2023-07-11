SUMMARY = "Documentation for texlive-xetex-devanagari"
DESCRIPTION = "This package includes the documentation for texlive-xetex-devanagari"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn34296"

RPM_NAME = "texlive-xetex-devanagari-doc-2023.201.0.0.5svn34296-52.2.noarch.rpm"
RPM_HASH = "79c952cdc1d6663673146d0f7f087d9388214bb86646cd933ff285efdb2c3a8da64a976606a1d6569b72c14ce004602388ba4fc61d80382cf366895c33c52a2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xetex-devanagari-doc"

RDEPENDS:${PN} += ""

inherit rpm
