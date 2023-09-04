SUMMARY = "Binary files of uplatex"
DESCRIPTION = "Binary files of uplatex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn52800"

RPM_NAME = "texlive-uplatex-bin-2023.20230311.svn52800-93.2.aarch64.rpm"
RPM_HASH = "91435197682939a9189ddb95d505144100b91fc7ae7f6b9e5e6df70704bdcbd01121de7f04ddec4436008ed433249fba4c3737a117dcc8251ad32a27b7db8b4d"

RPROVIDES:${PN} += "texlive-uplatex-bin"

RDEPENDS:${PN} += "texlive-uplatex"

inherit rpm
