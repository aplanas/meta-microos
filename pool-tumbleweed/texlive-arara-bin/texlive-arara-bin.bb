SUMMARY = "Binary files of arara"
DESCRIPTION = "Binary files of arara"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29036"

RPM_NAME = "texlive-arara-bin-2023.20230311.svn29036-93.2.aarch64.rpm"
RPM_HASH = "38bb4ed7d2019328b9d9984fd3ec97b79152804fa671eb78f8c19adf2fc40ad0614f37f9668fdcb73115d4bc170ec2e9d450d0146948ce7a086d8672230983cb"

RPROVIDES:${PN} += "texlive-arara-bin"

RDEPENDS:${PN} += "texlive-arara"

inherit rpm
