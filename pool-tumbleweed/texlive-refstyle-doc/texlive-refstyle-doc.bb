SUMMARY = "Documentation for texlive-refstyle"
DESCRIPTION = "This package includes the documentation for texlive-refstyle"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn20318"

RPM_NAME = "texlive-refstyle-doc-2023.209.0.0.5svn20318-54.2.noarch.rpm"
RPM_HASH = "3518dd60e15e4f2ecdf101f2ec3fe53c09e4aeb23046fddaf95cf52deb8dbff3e118b167cdce6bf25f06f2c241a0e6f5459b03c138fdc5cef7742175388c8d6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-refstyle-doc"

RDEPENDS:${PN} += ""

inherit rpm
