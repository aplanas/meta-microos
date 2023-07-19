SUMMARY = "Binary files of jadetex"
DESCRIPTION = "Binary files of jadetex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn3006"

RPM_NAME = "texlive-jadetex-bin-2023.20230311.svn3006-93.1.aarch64.rpm"
RPM_HASH = "6bfc1f913f009c51ef41289a895f3c7bdfea044dcd0e82f92b6a80ac26961d30248f4c5308c845c9806753fe96e763fd1592f7a34b5724783d2d0f23fc0277aa"

RPROVIDES:${PN} += "texlive-jadetex-bin"

RDEPENDS:${PN} += "texlive-jadetex"

inherit rpm
