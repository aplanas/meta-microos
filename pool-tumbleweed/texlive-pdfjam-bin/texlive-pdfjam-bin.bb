SUMMARY = "Binary files of pdfjam"
DESCRIPTION = "Binary files of pdfjam"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn52858"

RPM_NAME = "texlive-pdfjam-bin-2023.20230311.svn52858-93.1.aarch64.rpm"
RPM_HASH = "2a8ad69bc7e4938259091d095afabf2762dc684a28e291af9ed99024b943f91621a92e4dbb8b82d009d6b8329b98ae393d65f795dc62855c3390e0d8365527bd"

RPROVIDES:${PN} += "pdfjam \
texlive-pdfjam-bin"

RDEPENDS:${PN} += "texlive-pdfjam"

inherit rpm
