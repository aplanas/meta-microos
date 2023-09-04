SUMMARY = "Binary files of a2ping"
DESCRIPTION = "Binary files of a2ping"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn27321"

RPM_NAME = "texlive-a2ping-bin-2023.20230311.svn27321-93.2.aarch64.rpm"
RPM_HASH = "5bd800474660e7b32f7c548bc6d02888e93764745bfae5a5f601af83af01f051b845ed0803e35071132d5c6c322e5c7de6ef311b41ad0ad0451bffa2b97d16b9"

RPROVIDES:${PN} += "texlive-a2ping-bin"

RDEPENDS:${PN} += "texlive-a2ping"

inherit rpm
