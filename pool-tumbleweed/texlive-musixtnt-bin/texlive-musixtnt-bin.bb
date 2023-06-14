SUMMARY = "Binary files of musixtnt"
DESCRIPTION = "Binary files of musixtnt"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-musixtnt-bin-2023.20230311.svn62210-91.1.aarch64.rpm"
RPM_HASH = "216e232aaeceb639526f132163cc949ca0abfb7a8d6fb94a08f7b27de6b4b58c0a0bfc00ff6193655dce1701aea2479f0ac60d5a300f678e0310b8fdde92dab2"

RPROVIDES:${PN} += "texlive-musixtnt-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
texlive-musixtnt"

inherit rpm
