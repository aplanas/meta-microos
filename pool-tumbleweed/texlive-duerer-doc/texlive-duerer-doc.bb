SUMMARY = "Documentation for texlive-duerer"
DESCRIPTION = "This package includes the documentation for texlive-duerer"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn20741"

RPM_NAME = "texlive-duerer-doc-2023.209.svn20741-53.1.noarch.rpm"
RPM_HASH = "78140ef08c97b344400f835665b83ae1d124498af8dfd2ad4ff35e6c73526ae499b196416939a9cdc319dabb403c5b7d0491823a9b0e6d1cc020de73dbe19680"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-duerer-doc"

RDEPENDS:${PN} += ""

inherit rpm
