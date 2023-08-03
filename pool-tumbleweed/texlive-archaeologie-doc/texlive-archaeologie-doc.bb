SUMMARY = "Documentation for texlive-archaeologie"
DESCRIPTION = "This package includes the documentation for texlive-archaeologie"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.4.5svn57090"

RPM_NAME = "texlive-archaeologie-doc-2023.209.2.4.5svn57090-55.1.noarch.rpm"
RPM_HASH = "e6a7518c2a556d362bfe6cc432ef355077ace509ccdc16de1ae379a0adc71de248913dcdaa756abae02d68a75ac77170c6d37338b828a5a9064f5bc7f287313d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-archaeologie-doc"

RDEPENDS:${PN} += ""

inherit rpm
