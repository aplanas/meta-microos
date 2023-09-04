SUMMARY = "Binary files of chklref"
DESCRIPTION = "Binary files of chklref"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn52631"

RPM_NAME = "texlive-chklref-bin-2023.20230311.svn52631-93.2.aarch64.rpm"
RPM_HASH = "011f24065f5ba777a885ac7b1ed1588dbf7c1ad739ded96280b56e85ccb62497d2f47a876580ff49ec7daff2fa13d67c3b08258888c1142b0c5adae2577d297f"

RPROVIDES:${PN} += "texlive-chklref-bin"

RDEPENDS:${PN} += "texlive-chklref"

inherit rpm
