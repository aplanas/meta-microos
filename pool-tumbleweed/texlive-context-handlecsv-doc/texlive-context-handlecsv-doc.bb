SUMMARY = "Documentation for texlive-context-handlecsv"
DESCRIPTION = "This package includes the documentation for texlive-context-handlecsv"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn51306"

RPM_NAME = "texlive-context-handlecsv-doc-2023.209.svn51306-55.1.noarch.rpm"
RPM_HASH = "0888c4e2896f0ab5a45b85362175fca99a90a28517674099c0bfadda603bd4a02f64419873a0a3170d481c73ea4466738fe5d84cc1c6089b33913228eb674608"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-handlecsv-doc"

RDEPENDS:${PN} += ""

inherit rpm
