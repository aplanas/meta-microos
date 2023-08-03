SUMMARY = "Documentation for texlive-cmcyr"
DESCRIPTION = "This package includes the documentation for texlive-cmcyr"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn60630"

RPM_NAME = "texlive-cmcyr-doc-2023.209.svn60630-54.1.noarch.rpm"
RPM_HASH = "023a25361b61a1778dddcd0b6c47089aad244f2049dc9e4b0494d40fe3f60c4f48aedb963ded68af55a5491ec7a12bd5d0db1a1023580bee04ac51191e0169e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmcyr-doc"

RDEPENDS:${PN} += ""

inherit rpm
