SUMMARY = "Binary files of tikztosvg"
DESCRIPTION = "Binary files of tikztosvg"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn55132"

RPM_NAME = "texlive-tikztosvg-bin-2023.20230311.svn55132-93.1.aarch64.rpm"
RPM_HASH = "46b922c6745d5d06efc1d74e8d8f677bb52fa4244da78470c590d02c30082170bd1c6f4dabaea5e9faea36be50a45267911936051b87afbde39979ee0b3e0a5f"

RPROVIDES:${PN} += "texlive-tikztosvg-bin"

RDEPENDS:${PN} += "texlive-tikztosvg"

inherit rpm
