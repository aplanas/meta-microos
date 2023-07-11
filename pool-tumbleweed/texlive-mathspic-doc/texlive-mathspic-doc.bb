SUMMARY = "Documentation for texlive-mathspic"
DESCRIPTION = "This package includes the documentation for texlive-mathspic"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.13svn31957"

RPM_NAME = "texlive-mathspic-doc-2023.208.1.13svn31957-53.1.noarch.rpm"
RPM_HASH = "e4c85248b49c056070c642828b9a5a96ff7fd92bb8da02867deb06adb5e0bd6d410a3dc11b0529d9745914eb0b5ff68e1cf149002948bc9a0f861d5672d9d5df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-mathspic.1 \
texlive-mathspic-doc"

RDEPENDS:${PN} += ""

inherit rpm
