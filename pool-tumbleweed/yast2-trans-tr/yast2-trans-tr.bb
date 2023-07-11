SUMMARY = "YaST2 - Turkish Translations"
DESCRIPTION = "YaST2 - Translations for Turkish."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-tr-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "2fda6f67db71a3bc3a67b26238a82f738cbf00b8e52fded9634fa79d2569c9897f8950060bbb0c78cb97fa21e774b8ec63b48ef6a9c993f78d9617694361a965"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-tr \
yast2-trans-tr"

RDEPENDS:${PN} += ""

inherit rpm
