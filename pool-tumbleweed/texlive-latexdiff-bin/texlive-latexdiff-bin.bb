SUMMARY = "Binary files of latexdiff"
DESCRIPTION = "Binary files of latexdiff"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn16420"

RPM_NAME = "texlive-latexdiff-bin-2023.20230311.svn16420-93.1.aarch64.rpm"
RPM_HASH = "77a1c05ec74c74e708c2c5097ea76d822416bba99478aac15125e2c051358f97baf54ad2e438b884228bb2f06b663f599dabc7012b274e8ad0e9678f340be51f"

RPROVIDES:${PN} += "texlive-latexdiff-bin"

RDEPENDS:${PN} += "texlive-latexdiff"

inherit rpm
