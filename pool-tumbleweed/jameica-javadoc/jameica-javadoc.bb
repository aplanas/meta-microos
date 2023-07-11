SUMMARY = "Javadoc for jameica"
DESCRIPTION = "Developer documentation for Jameica."
LICENSE = "Apache-2.0 & GPL-2.0-only & LGPL-2.0-only & CPL-1.0 & Zlib & MPL-1.0 & EPL-1.0"

PV = "2.10.4"

RPM_NAME = "jameica-javadoc-2.10.4-1.2.noarch.rpm"
RPM_HASH = "bf8c37abf67ad300a21c293f1f926a51fcfd0cae98b12c9482563716c8c413ef2a6d88d901fb1d12b74d73bb833e65a9a0e1eee56ade1c188d742047cac887c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jameica-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
