SUMMARY = "Documentation for texlive-antomega"
DESCRIPTION = "This package includes the documentation for texlive-antomega"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8svn21933"

RPM_NAME = "texlive-antomega-doc-2023.209.0.0.8svn21933-55.1.noarch.rpm"
RPM_HASH = "5e13df5a9bbd2b3c0cd8a790d6990826e07b4eeda6ae5375718397cf4677eb140a93291d302a59739c3a1a5b38cf796782b13eabea1c1580557841c7780491b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-antomega-doc"

RDEPENDS:${PN} += ""

inherit rpm
