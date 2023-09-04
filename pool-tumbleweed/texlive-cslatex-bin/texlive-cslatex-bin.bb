SUMMARY = "Binary files of cslatex"
DESCRIPTION = "Binary files of cslatex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn3006"

RPM_NAME = "texlive-cslatex-bin-2023.20230311.svn3006-93.2.aarch64.rpm"
RPM_HASH = "fdd59c9730538b56713ed15f9307a9a586ecabd517dff9671dea3e5406f700a96b81223350f30e21b315cf20e260382e86b8daeda2a5022dd4338550f1673ac6"

RPROVIDES:${PN} += "texlive-cslatex-bin"

RDEPENDS:${PN} += "texlive-cslatex"

inherit rpm
