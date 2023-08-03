SUMMARY = "Documentation for texlive-xcjk2uni"
DESCRIPTION = "This package includes the documentation for texlive-xcjk2uni"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn54958"

RPM_NAME = "texlive-xcjk2uni-doc-2023.209.1.0svn54958-53.1.noarch.rpm"
RPM_HASH = "29da64f11256636c4012c9d2dc2c0e1fae28cca5c7020e70f652d6574b287afe52593bb15d51ff2b28294ec486a83c52ad05ebc82738277fe36c423add7033a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xcjk2uni-doc-zh \
texlive-xcjk2uni-doc"

RDEPENDS:${PN} += ""

inherit rpm
