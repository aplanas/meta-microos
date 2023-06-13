SUMMARY = "Erbi input method"
DESCRIPTION = "Erbi input methods. Includes: \
Super Erbi (as erbi) \
and  Erbi Qin-Song (erbi-qs)"
LICENSE = "GPL-3.0-or-later"

PV = "1.8.12"

RPM_NAME = "ibus-table-chinese-erbi-1.8.12-1.1.noarch.rpm"
RPM_HASH = "e829281c33f07f4e723af73c574166fc2f134f03403ac41966e6b0b4781841f47c3510c8f49ff44c445f5e9f1029e7bc19b8604ea736d3cdcc861799f632bfe2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-chinese-erbi \
ibus-table-erbi \
locale(ibus:zh_CN)"

RDEPENDS:${PN} += "/bin/sh \
ibus-table"

inherit rpm
