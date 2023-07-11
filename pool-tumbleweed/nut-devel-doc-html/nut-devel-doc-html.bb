SUMMARY = "Network UPS Tools - Documentation in HTML"
DESCRIPTION = "Developer manual in HTML format. \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "nut-devel-doc-html-2.8.0-3.1.noarch.rpm"
RPM_HASH = "bdcfe3fa28011e74ad2e9811f9b9153e99a3c768739fb3fafe0ed1d44ff2cda4a764008b801274be89c7ee2fd88522fa38ecae37c48fdaf2357c10dadfc218fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nut-devel-doc-html"

RDEPENDS:${PN} += "nut-doc-html \
nut-doc-images"

inherit rpm
