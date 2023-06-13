SUMMARY = "Documentation for texlive-fjodor"
DESCRIPTION = "This package includes the documentation for texlive-fjodor"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn53207"

RPM_NAME = "texlive-fjodor-doc-2023.201.svn53207-52.1.noarch.rpm"
RPM_HASH = "f56ad657148de9d9374aece3e30914364f03c37bf1dcbef44b93c5b64accdb36dcc56515a1c042dc91d56c24369200ccaf9aed0ecdd30a39055669276a761bd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fjodor-doc"

RDEPENDS:${PN} += ""

inherit rpm
