SUMMARY = "Documentation for texlive-dviasm"
DESCRIPTION = "This package includes the documentation for texlive-dviasm"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn64430"

RPM_NAME = "texlive-dviasm-doc-2023.209.svn64430-54.1.noarch.rpm"
RPM_HASH = "ae53baea70773e283b6771126e02f420051d6601c376299350c69bc200f3d0b05627f0a19a34ba3661c8bc5c3b38b25ac5fa2f4a2ed55d850193ca3f750dc241"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-dviasm.1 \
texlive-dviasm-doc"

RDEPENDS:${PN} += ""

inherit rpm
