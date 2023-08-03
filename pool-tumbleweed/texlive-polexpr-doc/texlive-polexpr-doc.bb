SUMMARY = "Documentation for texlive-polexpr"
DESCRIPTION = "This package includes the documentation for texlive-polexpr"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8.7asvn63337"

RPM_NAME = "texlive-polexpr-doc-2023.209.0.0.8.7asvn63337-53.1.noarch.rpm"
RPM_HASH = "99e64c0ad15acf1b6fc91d120b0e02add44acf5ae35603ba402922200f0912c73c7ac2b1deca5c213030ce73a2a14784a9e4c270f2d1cd71abfe53a7a8d7d2b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-polexpr-doc"

RDEPENDS:${PN} += ""

inherit rpm
