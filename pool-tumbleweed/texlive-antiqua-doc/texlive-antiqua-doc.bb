SUMMARY = "Documentation for texlive-antiqua"
DESCRIPTION = "This package includes the documentation for texlive-antiqua"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.001.003svn24266"

RPM_NAME = "texlive-antiqua-doc-2023.209.001.003svn24266-55.1.noarch.rpm"
RPM_HASH = "353f6f3f9876a523cd586354f35f5253dbb9f9b8e25234daf9ba264fba6fc542d78808e93d77622cdb6057451428b50e074d106254531f5b508660453ebd1153"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-antiqua-doc"

RDEPENDS:${PN} += ""

inherit rpm
