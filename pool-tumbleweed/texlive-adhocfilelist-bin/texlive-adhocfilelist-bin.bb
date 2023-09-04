SUMMARY = "Binary files of adhocfilelist"
DESCRIPTION = "Binary files of adhocfilelist"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn28038"

RPM_NAME = "texlive-adhocfilelist-bin-2023.20230311.svn28038-93.2.aarch64.rpm"
RPM_HASH = "4109b6cd221f3348322286f4fda0336406a034d4aabbdd0a42138a1e9db2a15e7341123e15ec5ee1a9398047f4f1fe92aa0dafd11466a034b6c7c09ec962b255"

RPROVIDES:${PN} += "texlive-adhocfilelist-bin"

RDEPENDS:${PN} += "texlive-adhocfilelist"

inherit rpm
