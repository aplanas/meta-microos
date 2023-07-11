SUMMARY = "Xmoto architecture independent data"
DESCRIPTION = "Xmoto translations and some other architecture independent data."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.2"

RPM_NAME = "xmoto-data-0.6.2-1.4.noarch.rpm"
RPM_HASH = "0a7b7e4eed864cfc14276da7b52ae115d3e72e2fe28e617fb3f366e058cb95696e5eb5b54458a3fb293b4a7bf78336a275485e50a299b7a2ff55e63bc8800be4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmoto-data"

RDEPENDS:${PN} += "xmoto"

inherit rpm
