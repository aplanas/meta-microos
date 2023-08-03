SUMMARY = "Documentation for texlive-pdfpc"
DESCRIPTION = "This package includes the documentation for texlive-pdfpc"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.7.0svn63866"

RPM_NAME = "texlive-pdfpc-doc-2023.209.0.0.7.0svn63866-52.1.noarch.rpm"
RPM_HASH = "4fa7527ffb87068d21dc099131427da2367273873664d735a663c9237aa430ddb1ab75859b33bd384ed619b966b3af09df52654021bb8c627ce15224e8cb7861"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfpc-doc"

RDEPENDS:${PN} += ""

inherit rpm
