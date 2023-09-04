SUMMARY = "Binary files of pax"
DESCRIPTION = "Binary files of pax"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn10843"

RPM_NAME = "texlive-pax-bin-2023.20230311.svn10843-93.2.aarch64.rpm"
RPM_HASH = "afceb97b960f509fc3cd3e3300bba22936d8741820160e0996a25460ba33629cc53b4d087c1c249df8ef2a9e33a0bf037f627285799c123f98fc8936535204ed"

RPROVIDES:${PN} += "texlive-pax-bin"

RDEPENDS:${PN} += "texlive-pax"

inherit rpm
