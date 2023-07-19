SUMMARY = "Binary files of mex"
DESCRIPTION = "Binary files of mex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn3006"

RPM_NAME = "texlive-mex-bin-2023.20230311.svn3006-93.1.aarch64.rpm"
RPM_HASH = "c7fca2f80c53cc54cf32800607641cc279868780b41571fdd8ae6fd7a5677f7c7889f000b9727eed358a245434e578a11e93397550de79baf7c039da64e6c9d4"

RPROVIDES:${PN} += "texlive-mex-bin"

RDEPENDS:${PN} += "texlive-mex"

inherit rpm
