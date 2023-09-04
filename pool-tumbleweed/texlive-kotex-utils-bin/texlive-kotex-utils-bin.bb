SUMMARY = "Binary files of kotex-utils"
DESCRIPTION = "Binary files of kotex-utils"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn32101"

RPM_NAME = "texlive-kotex-utils-bin-2023.20230311.svn32101-93.2.aarch64.rpm"
RPM_HASH = "53c326471949dae5a353cb9d7466e34adf79fa5891c63f206eddf54f02e608ab6c2246c2bbcd46cdd862824a9f811b855e148f2e968c0420b2cc61b43e0fbb4a"

RPROVIDES:${PN} += "texlive-kotex-utils-bin"

RDEPENDS:${PN} += "texlive-kotex-utils"

inherit rpm
