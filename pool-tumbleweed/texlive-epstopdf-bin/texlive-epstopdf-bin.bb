SUMMARY = "Binary files of epstopdf"
DESCRIPTION = "Binary files of epstopdf"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn18336"

RPM_NAME = "texlive-epstopdf-bin-2023.20230311.svn18336-93.1.aarch64.rpm"
RPM_HASH = "55c1c692fc449ee0e214644901c4a027e7427f228173d467c63ed2527a60f7c906987c5a69555d8f352277a72e9d0a6521f7cf16690cf80f109d0272021b2bf0"

RPROVIDES:${PN} += "texlive-epstopdf-bin"

RDEPENDS:${PN} += "texlive-epstopdf"

inherit rpm
