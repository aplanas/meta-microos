SUMMARY = "Binary files of crossrefware"
DESCRIPTION = "Binary files of crossrefware"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn45927"

RPM_NAME = "texlive-crossrefware-bin-2023.20230311.svn45927-93.1.aarch64.rpm"
RPM_HASH = "fb5a03c740585450c023d03fce8551941b7c57c81bf121978ce0d04de8f1bf830eb4d68dc5f7a7c18f4b7a96b7b4dee386dcf81dd9113ba5d886e74c2a591647"

RPROVIDES:${PN} += "texlive-crossrefware-bin"

RDEPENDS:${PN} += "texlive-crossrefware"

inherit rpm
