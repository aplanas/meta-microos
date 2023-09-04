SUMMARY = "Binary files of digestif"
DESCRIPTION = "Binary files of digestif"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65210"

RPM_NAME = "texlive-digestif-bin-2023.20230311.svn65210-93.2.aarch64.rpm"
RPM_HASH = "e9354da9088f9219d7c71cadd41a76e6fe1c7db374ad28fe1dbf07be29104193ff54b87c856393ca8ccdeed08bce38e153be8fc6230e1b7baef98ce0311519c8"

RPROVIDES:${PN} += "texlive-digestif-bin"

RDEPENDS:${PN} += "texlive-digestif"

inherit rpm
