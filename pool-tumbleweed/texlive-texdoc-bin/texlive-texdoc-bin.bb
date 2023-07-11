SUMMARY = "Binary files of texdoc"
DESCRIPTION = "Binary files of texdoc"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn47948"

RPM_NAME = "texlive-texdoc-bin-2023.20230311.svn47948-92.1.aarch64.rpm"
RPM_HASH = "c067d60b179f04255b322736601dc602faef8990493da947ae0575794d46f6a70dec3f4f15ac3f1610a7119ef8a57e51e79495464d0163215c6c614edbe93653"

RPROVIDES:${PN} += "texlive-texdoc-bin"

RDEPENDS:${PN} += "texlive-texdoc"

inherit rpm
