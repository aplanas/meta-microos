SUMMARY = "Documentation for texlive-rec-thy"
DESCRIPTION = "This package includes the documentation for texlive-rec-thy"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.3.8.2svn63982"

RPM_NAME = "texlive-rec-thy-doc-2023.209.3.8.2svn63982-54.2.noarch.rpm"
RPM_HASH = "221e15e9555e6102f6ce92360f7632a9c68b71adc7e79a07858e95248dec76d194abdc57100e8cbb6feabebcff795baccb99d8a625474b66e640ae81671d5358"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rec-thy-doc"

RDEPENDS:${PN} += ""

inherit rpm
