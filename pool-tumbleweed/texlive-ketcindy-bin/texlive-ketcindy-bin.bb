SUMMARY = "Binary files of ketcindy"
DESCRIPTION = "Binary files of ketcindy"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn49033"

RPM_NAME = "texlive-ketcindy-bin-2023.20230311.svn49033-91.1.aarch64.rpm"
RPM_HASH = "deb58fc269295675b7e4039af2317d418882e99d9026149b7843f6e1c566041d3e5c6904c998787ad5fc579b0d8b124e2dcf685aa6e54e099740788c843756e2"

RPROVIDES:${PN} += "texlive-ketcindy-bin \
texlive-ketcindy-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-ketcindy"

inherit rpm
