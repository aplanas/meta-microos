SUMMARY = "Binary files of webquiz"
DESCRIPTION = "Binary files of webquiz"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn50419"

RPM_NAME = "texlive-webquiz-bin-2023.20230311.svn50419-93.2.aarch64.rpm"
RPM_HASH = "0a8e762432fc7d2ad00a08b0b5d602a39dbef83de4a680fc5ab39f3ccf1997ccb03904157d75fec1761703cf807891cbf81ce3e7fa47a0b4ab21fda822c64793"

RPROVIDES:${PN} += "texlive-webquiz-bin"

RDEPENDS:${PN} += "texlive-webquiz"

inherit rpm
