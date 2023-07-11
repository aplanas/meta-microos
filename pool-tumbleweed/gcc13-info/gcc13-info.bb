SUMMARY = "Documentation for the GNU compiler collection"
DESCRIPTION = "GNU info-pages for the GNU compiler collection covering both user-level \
and internals documentation."
LICENSE = "GFDL-1.2-only"

PV = "13.1.1+git7364"

RPM_NAME = "gcc13-info-13.1.1+git7364-1.2.noarch.rpm"
RPM_HASH = "4122a5f6b050996d8a34ef7c945ed6102b4b1b524ac2ba89c5f6b4a4cb85bdc046c332fb703e6a454e7059ee562b825832cc456ae82409b0c6bd5012707821aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcc13-info"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
