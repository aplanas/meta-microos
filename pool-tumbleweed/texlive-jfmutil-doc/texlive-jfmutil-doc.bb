SUMMARY = "Documentation for texlive-jfmutil"
DESCRIPTION = "This package includes the documentation for texlive-jfmutil"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3.3svn60987"

RPM_NAME = "texlive-jfmutil-doc-2023.209.1.3.3svn60987-56.1.noarch.rpm"
RPM_HASH = "683bf1eb71c3fc8303c4f4fcde7c423db7c9fdff51ad3865dc8b1047bfee70f04217f0b46b391b5a4fd5abde10319b7775fcbcba1fbfc4208c588f3f5bf53867"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-jfmutil-doc-ja \
texlive-jfmutil-doc"

RDEPENDS:${PN} += ""

inherit rpm
