SUMMARY = "Documentation for texlive-lua-visual-debug"
DESCRIPTION = "This package includes the documentation for texlive-lua-visual-debug"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.9svn65464"

RPM_NAME = "texlive-lua-visual-debug-doc-2023.208.0.0.9svn65464-53.1.noarch.rpm"
RPM_HASH = "7fb966ed24bbfaa45a0ecdfdd0376ac31598ac25975c45a078fb2932618c0df493d023f36d41a39375e42f867eba869c60bb7c73a1cb781d4171caea12c88f48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lua-visual-debug-doc"

RDEPENDS:${PN} += ""

inherit rpm
