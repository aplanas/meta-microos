SUMMARY = "Documentation for texlive-qcm"
DESCRIPTION = "This package includes the documentation for texlive-qcm"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn63833"

RPM_NAME = "texlive-qcm-doc-2023.209.2.1svn63833-54.2.noarch.rpm"
RPM_HASH = "1908a14f44029faa927976fcfd3b9d96a740d75797a99aef2530146fd10ee588cef230327fa9c64046c36e035f8c0999e282e1df174bb53eb3b2539889bd18f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qcm-doc"

RDEPENDS:${PN} += ""

inherit rpm
