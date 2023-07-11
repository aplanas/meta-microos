SUMMARY = "Documentation for texlive-xwatermark"
DESCRIPTION = "This package includes the documentation for texlive-xwatermark"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5.2dsvn61719"

RPM_NAME = "texlive-xwatermark-doc-2023.201.1.5.2dsvn61719-52.2.noarch.rpm"
RPM_HASH = "c05115283444d5793b28e3462de3bbc1b844a95d7ba2ea27e8acb10ca0dfa36c248028cb42ca8dde54aec74e94692ec04def58aec5dee67d1f7b071acc4f774d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xwatermark-doc"

RDEPENDS:${PN} += ""

inherit rpm
