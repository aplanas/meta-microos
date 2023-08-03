SUMMARY = "Documentation for texlive-uptex-base"
DESCRIPTION = "This package includes the documentation for texlive-uptex-base"
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn65802"

RPM_NAME = "texlive-uptex-base-doc-2023.209.svn65802-54.1.noarch.rpm"
RPM_HASH = "bc95db38a9631141debd2ea5dc6b82dbe50343d7c9c2f743e747f751ae4c034e28c9d9c37c4ca48f4103e5b22f7674390e76e0818c0ef0559430937a6adcfd26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uptex-base-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
