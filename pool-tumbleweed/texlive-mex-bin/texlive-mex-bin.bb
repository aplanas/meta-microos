SUMMARY = "Binary files of mex"
DESCRIPTION = "Binary files of mex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn3006"

RPM_NAME = "texlive-mex-bin-2023.20230311.svn3006-92.1.aarch64.rpm"
RPM_HASH = "7502bb6011fc0ae449822602fc340315291a808b3a05a8475bfdf2334a4d3a284ef102b09380def331bf895a63c474ecaf391d527633ddb3c515ec6fa50fed0c"

RPROVIDES:${PN} += "texlive-mex-bin"

RDEPENDS:${PN} += "texlive-mex"

inherit rpm
