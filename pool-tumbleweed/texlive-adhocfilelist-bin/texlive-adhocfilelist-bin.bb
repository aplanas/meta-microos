SUMMARY = "Binary files of adhocfilelist"
DESCRIPTION = "Binary files of adhocfilelist"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn28038"

RPM_NAME = "texlive-adhocfilelist-bin-2023.20230311.svn28038-93.1.aarch64.rpm"
RPM_HASH = "8179ccc82a90316b867c47a84cd946ed9e392cd461f1f42a684cd82ad6799c90bda37bbb0ce8b8b5fe1d1119a7ed86294611759edb12734f01ddbe725be51f61"

RPROVIDES:${PN} += "texlive-adhocfilelist-bin"

RDEPENDS:${PN} += "texlive-adhocfilelist"

inherit rpm
