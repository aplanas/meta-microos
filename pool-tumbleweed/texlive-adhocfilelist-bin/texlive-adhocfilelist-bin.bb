SUMMARY = "Binary files of adhocfilelist"
DESCRIPTION = "Binary files of adhocfilelist"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn28038"

RPM_NAME = "texlive-adhocfilelist-bin-2023.20230311.svn28038-92.1.aarch64.rpm"
RPM_HASH = "9e59f989d465886d4b79247f5a1101c27cac291ef465c253f3a43f206f33866d6682f6248bb104d3576cd63e45909977530ee698fff29c94aa771f8413b5260f"

RPROVIDES:${PN} += "texlive-adhocfilelist-bin"

RDEPENDS:${PN} += "texlive-adhocfilelist"

inherit rpm
