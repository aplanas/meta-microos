SUMMARY = "Binary files of ltxfileinfo"
DESCRIPTION = "Binary files of ltxfileinfo"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29005"

RPM_NAME = "texlive-ltxfileinfo-bin-2023.20230311.svn29005-93.2.aarch64.rpm"
RPM_HASH = "1be53b4f2bbf15699461d16571826e62f24b51f9cc41976f15aa1a94f2058fe20eac4ec60150031b1f6b2a2c66c4d71c93e00d2a0ff905752ffbec4dfc8cc1c3"

RPROVIDES:${PN} += "texlive-ltxfileinfo-bin"

RDEPENDS:${PN} += "texlive-ltxfileinfo"

inherit rpm
