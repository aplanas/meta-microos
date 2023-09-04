SUMMARY = "Binary files of pkfix-helper"
DESCRIPTION = "Binary files of pkfix-helper"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13663"

RPM_NAME = "texlive-pkfix-helper-bin-2023.20230311.svn13663-93.2.aarch64.rpm"
RPM_HASH = "8367c02f2d996eddaeec31458f15899bae306186aa1add003baa3dc118cc272dd0a9544cf90d418f2993f7c01e95a14bc03ccea7494e54bda6195fbc2002f7f1"

RPROVIDES:${PN} += "texlive-pkfix-helper-bin"

RDEPENDS:${PN} += "texlive-pkfix-helper"

inherit rpm
