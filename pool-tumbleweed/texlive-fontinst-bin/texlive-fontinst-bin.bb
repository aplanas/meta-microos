SUMMARY = "Binary files of fontinst"
DESCRIPTION = "Binary files of fontinst"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn53554"

RPM_NAME = "texlive-fontinst-bin-2023.20230311.svn53554-93.2.aarch64.rpm"
RPM_HASH = "c18cfc0f2179921e5908782497fa30f9e1a0dae17cdc0d0192aaf8cdc07b791217cf3762335eab9ae9ac9039a3fa2d9dca1147be8509f4076d0129a21713d7ff"

RPROVIDES:${PN} += "texlive-fontinst-bin"

RDEPENDS:${PN} += "texlive-fontinst"

inherit rpm
