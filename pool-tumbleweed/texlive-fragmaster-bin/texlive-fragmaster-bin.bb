SUMMARY = "Binary files of fragmaster"
DESCRIPTION = "Binary files of fragmaster"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13663"

RPM_NAME = "texlive-fragmaster-bin-2023.20230311.svn13663-93.1.aarch64.rpm"
RPM_HASH = "cfee02c27f62d60e1afa382e25d51923ed0ab7c0453c3d35fee940650a7b4cfcc73f943855075ab60ebfa4026fb13b6e1ef6f03d5e2bd1c3419de605bdebe80b"

RPROVIDES:${PN} += "texlive-fragmaster-bin"

RDEPENDS:${PN} += "texlive-fragmaster"

inherit rpm
