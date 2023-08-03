SUMMARY = "Documentation for texlive-vertbars"
DESCRIPTION = "This package includes the documentation for texlive-vertbars"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0csvn49429"

RPM_NAME = "texlive-vertbars-doc-2023.209.1.0csvn49429-54.1.noarch.rpm"
RPM_HASH = "75147839823b0997356ea64cf3ef83d0a91e28a5d8ce57b8967cc7d9d83c4a3cb6c946d71fd12edf1cb1428015687248fae3992b80467edd877f7f0d737ca7ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vertbars-doc"

RDEPENDS:${PN} += ""

inherit rpm
