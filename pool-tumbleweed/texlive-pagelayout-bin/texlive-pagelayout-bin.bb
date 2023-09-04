SUMMARY = "Binary files of pagelayout"
DESCRIPTION = "Binary files of pagelayout"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65625"

RPM_NAME = "texlive-pagelayout-bin-2023.20230311.svn65625-93.2.aarch64.rpm"
RPM_HASH = "9da8c7ad195b7c4b7986d9782d0e275aa357643745af930f68f0f60c6af4aa032928a6611b24a8ee48fed329f870e7b9c24f4585815dbf4ce409b2785602960e"

RPROVIDES:${PN} += "texlive-pagelayout-bin"

RDEPENDS:${PN} += "texlive-pagelayout"

inherit rpm
