SUMMARY = "Binary files of texosquery"
DESCRIPTION = "Binary files of texosquery"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn43596"

RPM_NAME = "texlive-texosquery-bin-2023.20230311.svn43596-93.1.aarch64.rpm"
RPM_HASH = "582c67e37ccb14e84cb2cf6a067ad365d32b2d0bd61ccf47926ba5316bfe99796caab74bc693d4e25a7e84eb2908e78a3eac41078a582cd149e69fa967624177"

RPROVIDES:${PN} += "texlive-texosquery-bin"

RDEPENDS:${PN} += "texlive-texosquery"

inherit rpm
