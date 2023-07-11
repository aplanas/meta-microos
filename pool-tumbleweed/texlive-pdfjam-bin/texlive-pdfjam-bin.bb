SUMMARY = "Binary files of pdfjam"
DESCRIPTION = "Binary files of pdfjam"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn52858"

RPM_NAME = "texlive-pdfjam-bin-2023.20230311.svn52858-92.1.aarch64.rpm"
RPM_HASH = "1a3513e253c929f65e701bda17373a9744925c620c9c7b3b1d3fc1102050cef0cf884c7d2bf4a158f47a34482787431f7d400c9cbe2aae6e824c94933b5a4343"

RPROVIDES:${PN} += "pdfjam \
texlive-pdfjam-bin"

RDEPENDS:${PN} += "texlive-pdfjam"

inherit rpm
