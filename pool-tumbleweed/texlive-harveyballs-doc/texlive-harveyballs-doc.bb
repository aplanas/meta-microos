SUMMARY = "Documentation for texlive-harveyballs"
DESCRIPTION = "This package includes the documentation for texlive-harveyballs"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1svn32003"

RPM_NAME = "texlive-harveyballs-doc-2023.201.1.1svn32003-53.1.noarch.rpm"
RPM_HASH = "36f3e7843acc83fa039d90d72ae7967d797aded39f57127b52953d3e900ba9bd499c1fbb7baf0bf1f225c63db6c5fad7306b0008bab3a89bfd6a0dc7c2732aaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-harveyballs-doc"

RDEPENDS:${PN} += ""

inherit rpm
