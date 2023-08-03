SUMMARY = "Documentation for texlive-oubraces"
DESCRIPTION = "This package includes the documentation for texlive-oubraces"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn21833"

RPM_NAME = "texlive-oubraces-doc-2023.209.svn21833-55.1.noarch.rpm"
RPM_HASH = "707b5600e117e815ea9f63d0ca79022444b3722b0eaccef0b7c2b5244bc2cef0c1f2506c45f04b9827d52047ad721f6a77d423dd25b846a1a7e77ad965858676"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-oubraces-doc"

RDEPENDS:${PN} += ""

inherit rpm
