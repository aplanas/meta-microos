SUMMARY = "Documentation for texlive-pwebmac"
DESCRIPTION = "This package includes the documentation for texlive-pwebmac"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.4.8.1svn63731"

RPM_NAME = "texlive-pwebmac-doc-2023.209.4.8.1svn63731-54.1.noarch.rpm"
RPM_HASH = "c98fa25eac59470e08af6af6967f12438b7a37298b66bacbccbfdc1a8ef4094ab9a499675157b70d40e4b2e3953a6cf48bd17d10146b08c4e5339e9795e653bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pwebmac-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
