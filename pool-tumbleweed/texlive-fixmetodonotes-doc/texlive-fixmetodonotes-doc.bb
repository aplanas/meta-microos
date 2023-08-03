SUMMARY = "Documentation for texlive-fixmetodonotes"
DESCRIPTION = "This package includes the documentation for texlive-fixmetodonotes"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.0.0.2.2svn30168"

RPM_NAME = "texlive-fixmetodonotes-doc-2023.209.0.0.2.2svn30168-53.1.noarch.rpm"
RPM_HASH = "90fa1d4fbab2bd7f3e8e47cfcc724f547b6294d15bec9b291d90722c759720bdf4dfcdd1aa9de330f85ab1c81e842f8534e87bcf02a3e4349eb62a0c4ec29b9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fixmetodonotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
