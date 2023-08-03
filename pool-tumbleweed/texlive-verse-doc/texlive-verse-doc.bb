SUMMARY = "Documentation for texlive-verse"
DESCRIPTION = "This package includes the documentation for texlive-verse"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.4bsvn34017"

RPM_NAME = "texlive-verse-doc-2023.209.2.4bsvn34017-54.1.noarch.rpm"
RPM_HASH = "95f197042e4d711425d54345f2d56e2c38dbf5e46cdbbf0a224b8c70720e39b0fdf9386041c7620a173d2b1352e9257c62b839966df29320e0bcdfa75489bfd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-verse-doc"

RDEPENDS:${PN} += ""

inherit rpm
