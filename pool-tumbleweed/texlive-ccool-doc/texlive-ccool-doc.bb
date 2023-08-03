SUMMARY = "Documentation for texlive-ccool"
DESCRIPTION = "This package includes the documentation for texlive-ccool"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.2svn60600"

RPM_NAME = "texlive-ccool-doc-2023.209.3.2svn60600-53.1.noarch.rpm"
RPM_HASH = "3ed670fcb1bbcc14ff4cbf4f659947ce164763b479a12a65e9b2e515e1d880cb9ae1bca6a254af2981e377d4b436a2770a24e24acaa866755cf3b5974ffd0f39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ccool-doc"

RDEPENDS:${PN} += ""

inherit rpm
