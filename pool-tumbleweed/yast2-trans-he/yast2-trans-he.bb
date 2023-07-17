SUMMARY = "YaST2 - Hebrew Translations"
DESCRIPTION = "YaST2 - Translations for Hebrew."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-he-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "75e7e94770ff54f66f6186b6098d12b10bb3d1a32e5ef1b39d58ef3b271be6c58faf11f2103e352506f531549ddd2683603744ccdfc2cae26c464c59903f9add"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-he \
yast2-trans-he"

RDEPENDS:${PN} += ""

inherit rpm
