SUMMARY = "Documentation for texlive-dvips"
DESCRIPTION = "This package includes the documentation for texlive-dvips"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66203"

RPM_NAME = "texlive-dvips-doc-2023.209.svn66203-54.2.noarch.rpm"
RPM_HASH = "f46806d1e066b91040dcc5b4db0a8fe42a6d5a5a7d0b64c877c25984f18fd2eab9f7fd792325ad953a4d895a59c77864a3d44f66d41befca9524b3aced3af7fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-afm2tfm.1 \
man-dvips.1 \
texlive-dvips-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
