SUMMARY = "Binary files of texlive-scripts"
DESCRIPTION = "Binary files of texlive-scripts"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn64356"

RPM_NAME = "texlive-scripts-bin-2023.20230311.svn64356-92.1.aarch64.rpm"
RPM_HASH = "3f1c13864c8d63414c24e4f440ec601cea9896ce8e3a61c539555701607600f99acb98b220b35b6710c4ae2ed96e253240fec1f0c248453de93782523b33a1ce"

RPROVIDES:${PN} += "texlive-scripts-bin"

RDEPENDS:${PN} += "texlive-scripts"

inherit rpm
