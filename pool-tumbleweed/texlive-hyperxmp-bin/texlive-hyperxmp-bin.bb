SUMMARY = "Binary files of hyperxmp"
DESCRIPTION = "Binary files of hyperxmp"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn56984"

RPM_NAME = "texlive-hyperxmp-bin-2023.20230311.svn56984-93.2.aarch64.rpm"
RPM_HASH = "f62dfc9352674f8e1806cfba994f07591bbf41cc950754d5acea9b66ce7314c897467f503dd9fd5d5284d5c37e7fa3c07f5224b69779d26c6fdcf22cc519927a"

RPROVIDES:${PN} += "texlive-hyperxmp-bin"

RDEPENDS:${PN} += "texlive-hyperxmp"

inherit rpm
