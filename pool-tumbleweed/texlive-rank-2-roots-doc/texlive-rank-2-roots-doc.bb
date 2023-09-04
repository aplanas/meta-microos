SUMMARY = "Documentation for texlive-rank-2-roots"
DESCRIPTION = "This package includes the documentation for texlive-rank-2-roots"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn61719"

RPM_NAME = "texlive-rank-2-roots-doc-2023.209.1.0svn61719-54.2.noarch.rpm"
RPM_HASH = "8cdf859b287306cec099d752327d2bca752d5b2ce0fd07c2adc3dea5cdf943a1d2c6c42883cca401d67564ac694b72dbceeba95e1e5517fed6b49ba548c25fd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rank-2-roots-doc"

RDEPENDS:${PN} += ""

inherit rpm
