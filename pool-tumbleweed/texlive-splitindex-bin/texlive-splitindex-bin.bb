SUMMARY = "Binary files of splitindex"
DESCRIPTION = "Binary files of splitindex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29688"

RPM_NAME = "texlive-splitindex-bin-2023.20230311.svn29688-91.1.aarch64.rpm"
RPM_HASH = "b417a98dfe7da3b2d71e335b15dbbe8d1914d9a92501c773ebb6fb966ca43ae93580e455c464a8af3e94db16a85c299ce7ddd872881d0e5857f1a1f2aa0de479"

RPROVIDES:${PN} += "texlive-splitindex-bin"

RDEPENDS:${PN} += "texlive-splitindex"

inherit rpm
