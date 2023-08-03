SUMMARY = "Documentation for texlive-texnegar"
DESCRIPTION = "This package includes the documentation for texlive-texnegar"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1esvn57692"

RPM_NAME = "texlive-texnegar-doc-2023.209.0.0.1esvn57692-55.1.noarch.rpm"
RPM_HASH = "0fc2b46cf4707fd5c00f7b4374bb1cf35b6f058c14868f91ac69cbc644dcc938516b438c01f692a24138ec55bfa8f1c317c56174536fefad843a958601061880"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texnegar-doc"

RDEPENDS:${PN} += ""

inherit rpm
