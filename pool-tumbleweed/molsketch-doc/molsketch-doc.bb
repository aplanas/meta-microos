SUMMARY = "Documentation for molsketch"
DESCRIPTION = "2D molecular structures editor. \
 \
Help documentation for molsketch."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.3"

RPM_NAME = "molsketch-doc-0.7.3-1.3.noarch.rpm"
RPM_HASH = "aa60778eb4d148fae051d0bc3f21ede05dc9a593cd0ff88f8539fe9c8087aec5c7d88b80e4a2a67e7f877c7b9366b1adf53567a1e1204d04adf5d68919d499f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "molsketch-doc"

RDEPENDS:${PN} += ""

inherit rpm
