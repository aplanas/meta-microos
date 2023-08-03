SUMMARY = "Documentation for texlive-worldflags"
DESCRIPTION = "This package includes the documentation for texlive-worldflags"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn59171"

RPM_NAME = "texlive-worldflags-doc-2023.209.svn59171-54.1.noarch.rpm"
RPM_HASH = "9da3c6588e7ce5d73be7f5628e0f2cc6a6f000811d316905c2be9cb5d832ed71648b05f5902a226804f6b62e6b0622020d2c66f91bf1417305c6e7c6b80c5a31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-worldflags-doc"

RDEPENDS:${PN} += ""

inherit rpm
