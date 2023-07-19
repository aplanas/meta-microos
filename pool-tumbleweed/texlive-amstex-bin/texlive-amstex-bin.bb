SUMMARY = "Binary files of amstex"
DESCRIPTION = "Binary files of amstex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn3006"

RPM_NAME = "texlive-amstex-bin-2023.20230311.svn3006-93.1.aarch64.rpm"
RPM_HASH = "47ae223ed5853c7e08896a46cf9f6cab0b4d24d444a5a1bd89462427ee1bd664e9e5b34ea8bb74a43b251bf0ed4c5082cde5b367cdcfd9bee9da83c590125bd3"

RPROVIDES:${PN} += "texlive-amstex-bin"

RDEPENDS:${PN} += "texlive-amstex"

inherit rpm
