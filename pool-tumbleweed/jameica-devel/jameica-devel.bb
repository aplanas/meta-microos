SUMMARY = "SDK for the Jameica framework"
DESCRIPTION = "Source code required to build and develop Jameica plugins."
LICENSE = "Apache-2.0 & GPL-2.0-only & LGPL-2.0-only & CPL-1.0 & Zlib & MPL-1.0 & EPL-1.0"

PV = "2.10.4"

RPM_NAME = "jameica-devel-2.10.4-1.2.noarch.rpm"
RPM_HASH = "10fc967c754228d11c70381866a8029629f8f0903f0a37e2079bedf433505b4ca693c1c55de65985eb6c18ec87ecf76f776422134edc2ed00178451976505f43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jameica-devel"

RDEPENDS:${PN} += "jameica"

inherit rpm
