SUMMARY = "Binary files of texlogfilter"
DESCRIPTION = "Binary files of texlogfilter"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn61780"

RPM_NAME = "texlive-texlogfilter-bin-2023.20230311.svn61780-93.2.aarch64.rpm"
RPM_HASH = "85b07a38f81fb5632f1aabee09f0cd40b2152be07276527255f6d150daaeca3600875fcee965d2a22c22e07a6d52b8f6dabad01d6a354f755f304ee0374227f1"

RPROVIDES:${PN} += "texlive-texlogfilter-bin"

RDEPENDS:${PN} += "texlive-texlogfilter"

inherit rpm
