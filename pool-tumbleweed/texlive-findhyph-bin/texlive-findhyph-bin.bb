SUMMARY = "Binary files of findhyph"
DESCRIPTION = "Binary files of findhyph"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn14758"

RPM_NAME = "texlive-findhyph-bin-2023.20230311.svn14758-92.1.aarch64.rpm"
RPM_HASH = "ece48691831e71b0630603ca89c2c59a76494fe816ba0966c9214079e45078d2860f55f02c60aaa5ac29111e308e512867fed00dd3684403acdbf2899702d507"

RPROVIDES:${PN} += "texlive-findhyph-bin"

RDEPENDS:${PN} += "texlive-findhyph"

inherit rpm
