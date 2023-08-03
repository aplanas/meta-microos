SUMMARY = "Documentation for texlive-metalogox"
DESCRIPTION = "This package includes the documentation for texlive-metalogox"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn65448"

RPM_NAME = "texlive-metalogox-doc-2023.209.1.01svn65448-55.1.noarch.rpm"
RPM_HASH = "50302efbcb7c0d7c887da67a0abaed1b75e8b0dfb5f54699452046e13936dcad7fd89bd7ba2c0d46f5003ef720157ff64b7f010b324d4a7aae74bcf88d98f8b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metalogox-doc"

RDEPENDS:${PN} += ""

inherit rpm
