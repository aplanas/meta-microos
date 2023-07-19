SUMMARY = "Binary files of a2ping"
DESCRIPTION = "Binary files of a2ping"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn27321"

RPM_NAME = "texlive-a2ping-bin-2023.20230311.svn27321-93.1.aarch64.rpm"
RPM_HASH = "e258c42741a04086a626cfad5f5704adf6dd064d099ce5dddae5f2965cb6e193fd7889b23c592809a75eeb3977200109bf80cae281bc00a8de3e4a2d4f2b6be6"

RPROVIDES:${PN} += "texlive-a2ping-bin"

RDEPENDS:${PN} += "texlive-a2ping"

inherit rpm
