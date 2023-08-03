SUMMARY = "Documentation for texlive-lcd"
DESCRIPTION = "This package includes the documentation for texlive-lcd"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn16549"

RPM_NAME = "texlive-lcd-doc-2023.209.0.0.3svn16549-55.1.noarch.rpm"
RPM_HASH = "77966c339d3ba3cbbf10ade5e62e5808dd13eebee48be7b759399936971c916801c39caa9a129b3e288b504414e48b1a89a2b8256f3db6b3dcc3a97071387c11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lcd-doc"

RDEPENDS:${PN} += ""

inherit rpm
