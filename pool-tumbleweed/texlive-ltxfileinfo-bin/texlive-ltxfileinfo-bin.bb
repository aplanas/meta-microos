SUMMARY = "Binary files of ltxfileinfo"
DESCRIPTION = "Binary files of ltxfileinfo"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29005"

RPM_NAME = "texlive-ltxfileinfo-bin-2023.20230311.svn29005-93.1.aarch64.rpm"
RPM_HASH = "07945ca08e2e25c4b1a3e58f432ab9ecd570844bb56676b0503a3a5272771586cc915687c4f2921eab72590c8b6903e35cdef2fa435af346d638769e5659b890"

RPROVIDES:${PN} += "texlive-ltxfileinfo-bin"

RDEPENDS:${PN} += "texlive-ltxfileinfo"

inherit rpm
