SUMMARY = "Binary files of pkfix"
DESCRIPTION = "Binary files of pkfix"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13364"

RPM_NAME = "texlive-pkfix-bin-2023.20230311.svn13364-91.1.aarch64.rpm"
RPM_HASH = "e44a239255b567a17d3fff9c5dc8664f01b0e81404df916165f675153cc557bcf943ab9520be605f92b9e8043e3aa4377f561f43d4373aecddd93cdb9d689edd"

RPROVIDES:${PN} += "texlive-pkfix-bin \
texlive-pkfix-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-pkfix"

inherit rpm
