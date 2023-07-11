SUMMARY = "Binary files of lollipop"
DESCRIPTION = "Binary files of lollipop"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn41465"

RPM_NAME = "texlive-lollipop-bin-2023.20230311.svn41465-92.1.aarch64.rpm"
RPM_HASH = "d011b475a1be552d250aa753793de7196b5ddba89dd161233a2456298c70b2cbfac792b202467f19c0471e1387dd0e8e323602e4eefce32febaa79fa77e91ee5"

RPROVIDES:${PN} += "texlive-lollipop-bin"

RDEPENDS:${PN} += "texlive-lollipop"

inherit rpm
