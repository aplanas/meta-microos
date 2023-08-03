SUMMARY = "Documentation for texlive-kotex-utf"
DESCRIPTION = "This package includes the documentation for texlive-kotex-utf"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0.0svn63690"

RPM_NAME = "texlive-kotex-utf-doc-2023.209.3.0.0svn63690-56.1.noarch.rpm"
RPM_HASH = "0356c28e186fc6d60a1d67792135d529b48e786f0f7efa55cd1b23aba064a2877040b5d25b2bd5dd7f4889ad13d9eef143af9bf8cc1b7b47e9905d315f52bea5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-kotex-utf-doc-ko \
texlive-kotex-utf-doc"

RDEPENDS:${PN} += ""

inherit rpm
