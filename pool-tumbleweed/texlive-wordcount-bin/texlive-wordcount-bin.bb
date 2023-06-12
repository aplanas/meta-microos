SUMMARY = "Binary files of wordcount"
DESCRIPTION = "Binary files of wordcount"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn46165"

RPM_NAME = "texlive-wordcount-bin-2023.20230311.svn46165-91.1.aarch64.rpm"
RPM_HASH = "12482e7ab3f19d475cc72be4787933d9b4700d414a91252a9c01a1159bfd33afbb73a54d90cc662db605e5f83c7a1147041b76f858f6155deb3ff22954f375c3"

RPROVIDES:${PN} += "texlive-wordcount-bin \
texlive-wordcount-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-wordcount"

inherit rpm
