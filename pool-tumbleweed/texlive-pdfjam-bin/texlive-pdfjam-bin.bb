SUMMARY = "Binary files of pdfjam"
DESCRIPTION = "Binary files of pdfjam"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn52858"

RPM_NAME = "texlive-pdfjam-bin-2023.20230311.svn52858-93.2.aarch64.rpm"
RPM_HASH = "0b03718f35e0e9b378026423b091552d3cdbee08b658c554d4abf994565f442bd89c11b862ba1255b9b600bc7e4d0c920e53207cb6b6ce71438706e68aa0f684"

RPROVIDES:${PN} += "pdfjam \
texlive-pdfjam-bin"

RDEPENDS:${PN} += "texlive-pdfjam"

inherit rpm
