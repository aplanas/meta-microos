SUMMARY = "Documentation for texlive-colortbl"
DESCRIPTION = "This package includes the documentation for texlive-colortbl"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0fsvn64015"

RPM_NAME = "texlive-colortbl-doc-2023.209.1.0fsvn64015-54.1.noarch.rpm"
RPM_HASH = "40245d3a6ad9a006212d0217f63356c5033c07fcc054786921916bd68869c30e6015d25853cc7bfee32acc2f49093edff402600fcf3756daa1b72cf3067da5d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-colortbl-doc-de;en \
texlive-colortbl-doc"

RDEPENDS:${PN} += ""

inherit rpm
