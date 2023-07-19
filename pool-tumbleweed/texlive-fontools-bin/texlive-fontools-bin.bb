SUMMARY = "Binary files of fontools"
DESCRIPTION = "Binary files of fontools"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn25997"

RPM_NAME = "texlive-fontools-bin-2023.20230311.svn25997-93.1.aarch64.rpm"
RPM_HASH = "dfb8c86b869b339edab3bcf19bd3531bcdf16499ac3ee21ba4f56b8b87ed613e337cba9f49cdfcc4ed6ff8ffe456076ac13b596e4c1210873cb6bcb1909e3cdc"

RPROVIDES:${PN} += "texlive-fontools-bin"

RDEPENDS:${PN} += "texlive-fontools"

inherit rpm
