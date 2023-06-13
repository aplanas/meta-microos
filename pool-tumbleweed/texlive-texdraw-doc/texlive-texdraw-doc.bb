SUMMARY = "Documentation for texlive-texdraw"
DESCRIPTION = "This package includes the documentation for texlive-texdraw"
LICENSE = "LPPL-1.0"

PV = "2023.201.v2r3svn64477"

RPM_NAME = "texlive-texdraw-doc-2023.201.v2r3svn64477-54.1.noarch.rpm"
RPM_HASH = "7f6eac2c5751aaf8c74e39a07df41df4380e75048fd410cec87b3df2c7e8eb54dd5ddf1090b1b51dbd23166cf4f641f7e0021219d48b21dd84aef3db70004436"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texdraw-doc"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
