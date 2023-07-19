SUMMARY = "Binary files of dtxgen"
DESCRIPTION = "Binary files of dtxgen"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29031"

RPM_NAME = "texlive-dtxgen-bin-2023.20230311.svn29031-93.1.aarch64.rpm"
RPM_HASH = "e0129218057f6e52a1b7eefa75c792d934ee0060c112698923374b519e171f832ded2253a6f482c18ef708a1668fb416d8482abf7e349b8d9093dc859ba0b02d"

RPROVIDES:${PN} += "texlive-dtxgen-bin"

RDEPENDS:${PN} += "texlive-dtxgen"

inherit rpm
