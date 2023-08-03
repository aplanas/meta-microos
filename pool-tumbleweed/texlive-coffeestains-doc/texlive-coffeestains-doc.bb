SUMMARY = "Documentation for texlive-coffeestains"
DESCRIPTION = "This package includes the documentation for texlive-coffeestains"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.0.0.5.1svn59703"

RPM_NAME = "texlive-coffeestains-doc-2023.209.0.0.5.1svn59703-54.1.noarch.rpm"
RPM_HASH = "c35942ca1ad126dec7700d9b5427a01ea53afbec9b66379418c5950b9b2fe7a0bf960824d9baa0012238ce163436623d65f79aa6f72ef0b3314dbe7e6af9d7bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-coffeestains-doc-fr \
texlive-coffeestains-doc"

RDEPENDS:${PN} += ""

inherit rpm
