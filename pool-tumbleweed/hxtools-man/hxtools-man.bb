SUMMARY = "Manual pages for the hxtools suite"
DESCRIPTION = "This package contains the manual pages for the binaries and scripts \
from hxtools."
LICENSE = "GPL-2.0-or-later & WTFPL"

PV = "20230411"

RPM_NAME = "hxtools-man-20230411-1.2.noarch.rpm"
RPM_HASH = "eb4aa5fa10903ff0b47087048240d04270b3a44a7d717f4f10ea001cd8a1d96431db71c3e3922ba40480a250188bf0822d3e1c4b5c76986e398b3502744f85ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hxtools-man"

RDEPENDS:${PN} += ""

inherit rpm
