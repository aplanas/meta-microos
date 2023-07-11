SUMMARY = "Documentation for texlive-random"
DESCRIPTION = "This package includes the documentation for texlive-random"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.2svn54723"

RPM_NAME = "texlive-random-doc-2023.201.0.0.2svn54723-53.2.noarch.rpm"
RPM_HASH = "63df23a143b9d88312d783dd58df69276f4bcb45f685f4748f9d8888353bc0deffde93e50c15ec86fd557d5b635f2d14c87f3de9b29fb7c5e0c3081261c3b280"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-random-doc"

RDEPENDS:${PN} += ""

inherit rpm
