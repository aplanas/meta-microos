SUMMARY = "Binary files of jfmutil"
DESCRIPTION = "Binary files of jfmutil"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn44835"

RPM_NAME = "texlive-jfmutil-bin-2023.20230311.svn44835-92.1.aarch64.rpm"
RPM_HASH = "9aa2f3abefcf44bbe3066e020271185bb27d22a126fc0b95c452c13c88aadd006ccf413ae13fef18397d2e03d4701d18702653b8ae8465edf51f14112513b779"

RPROVIDES:${PN} += "texlive-jfmutil-bin"

RDEPENDS:${PN} += "texlive-jfmutil"

inherit rpm
