SUMMARY = "YaST2 - Pashto Translations"
DESCRIPTION = "YaST2 - Translations for Pashto."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-ps-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "e016fd8033f2cec6316a17ca42133a15a408b6890ef73135711485723eb945f249f3da945ff416407a73877cc6fe590840488e0f3ebdb88b81ecbd1d44ca2fe8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ps \
yast2-trans-ps"

RDEPENDS:${PN} += ""

inherit rpm
